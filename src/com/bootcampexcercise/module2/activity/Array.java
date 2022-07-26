package com.bootcampexcercise.module2.activity;

public class Array {
    public static void main(String[] args) {

        int[] nums = {25, 3, 5, 100, 7, 4, 15};

        int largest;
        largest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("Largest in the array is " + largest);

    }
}
