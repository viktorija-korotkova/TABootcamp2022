package com.bootcampexcercise.module2.activity;

public class IfElseActivity {
    public static void main (String[] args) {
        int apple;
        apple = 7;
        if (apple < 0) {
            System.out.println("Cannot be negative a number");
        } else if (apple > 10) {
            System.out.println("Enough to cook a pie");
        } else {
            System.out.println("Not enough to cook a pie");
        }

    }
}
