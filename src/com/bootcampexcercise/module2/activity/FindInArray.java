package com.bootcampexcercise.module2.activity;

public class FindInArray {
    public static void main(String[] args) {
        int[] nums = {25, 3, 5, 100, 7, 4, 15};
        int resultLargest = nums[0];
        int resulsSmallest = nums[0];

        // Find smallest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < resulsSmallest) {
                resulsSmallest = nums[i];
            }
        }
        System.out.println("Smallest in array is " + resulsSmallest);

        // Find largest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > resultLargest) {
                resultLargest = nums[i];
            }
        }
        System.out.println("Largest in array is " + resultLargest);
    }
}
