package com.practice;

import java.util.Random;

public class Task6 {

    public static void randomize1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    public static void randomize2(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
    }

    public static void sortandout(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int change = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = change;
                }
            }
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        randomize1(nums);
        randomize2(nums);
        sortandout(nums);
    }
}