package com.bootcampexcercise.module2.activity;
//add = сложение
//subtraction - вычитание
//multiply - умножение
//divide - деление
// есть заданные числа и заданный массив с числами, все операции проводятся на этих элементах
public class CalculatorMethods {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int[] nums = {1, 2, 3, 4};
        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));
    }

    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    private static int subtract(int x, int y) {
        int substr = x - y;
        return substr;
        //TODO implement subtraction
    }

    private static int multiply(int[] numbers) {
        int temp = 1;
        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 && y == 0) {
            System.out.println("dividing 0 with 0 is not possible");
            //TODO complete the code so message is printed that dividing 0 with 0 is not possible
        } else if (y == 0) {
            System.out.println("division by 0 is not possible");
            //TODO complete the code so message is printed that division by 0 is not possible
        } else {
            System.out.println("division is done");
            //TODO complete the code so that division is done
        }
        return divValue;
    }

}