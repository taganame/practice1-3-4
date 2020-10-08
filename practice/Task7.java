package com.practice;

public class Task7 {
    public static int CalcFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(CalcFactorial(4));
    }
}
