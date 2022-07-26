package com.bootcampexcercise.module2.activity;

public class Calculator {
    public static void main(String[] args) {
        startCalculations();
    }

    public static void startCalculations() {
        int x = 10;
        int y = 5;
        int[] nums = {1, 2, 3, 4};
        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    private static int subtract(int x, int y) {
        return x - y;
    }

    private static int multiply(int[] numbers) {
        int tempNum = 1;
        for (int i = 0; i < numbers.length; i++) {
            tempNum = tempNum * numbers[i];
        }
        return tempNum;
    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 && y == 0) {
            System.out.println("dividing 0 with 0 is not possible");
        } else if (y == 0) {
            System.out.println("division by 0 is not possible");
        } else {
            System.out.println("division is done");
        }
        return divValue;
    }
}