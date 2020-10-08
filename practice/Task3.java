package com.practice;

public class Task3 {
    public static void main(String args[]) {
        int sum = 0;
        int[] nums = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
