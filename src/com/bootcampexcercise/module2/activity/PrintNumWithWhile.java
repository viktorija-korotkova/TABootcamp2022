package com.bootcampexcercise.module2.activity;

public class PrintNumWithWhile {
    public static void main(String[] args) {
        // Print all even numbers less than 100
        System.out.println("Even numbers 1-100:");
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }

        // Print all odd numbers less than 100
        System.out.println("Odd numbers 1-100:");
        int j = 1;
        while (j < 100) {
            System.out.println(j);
            j = j + 2;
        }
    }
}
