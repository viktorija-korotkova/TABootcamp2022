package com.bootcampexcercise.module2.activity;

public class PrintNumWithWhileBetterWay {
    public static void main(String[] args) {
        // Print all even numbers less than 100
        int i = 0;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println("The odd number less than 100 is " + i);
            } else {
                System.out.println("The even number less than 100 is " + i);
            }
            ++i;
        }

    }
}
