package com.bootcampexcercise.module2.activity;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 11; i<=20; i++){
            System.out.println("Multiplication table of "+ i + " started");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + "*"+ j + "="+ i * j);
            }
           System.out.println("Multiplication table of "+ i + " completed");
        }

    }
}
