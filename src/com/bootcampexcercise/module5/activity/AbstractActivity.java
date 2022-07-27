package com.bootcampexcercise.module5.activity;

public class AbstractActivity {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 6, "green");

        System.out.println("rect1 dimensions: length = " + rect1.getLength() + ", breath = " + rect1.getBreadth());
        System.out.println("rect1 perimeter: " + rect1.calculatePerimeter());
        System.out.println("rect1 area: " + rect1.calculateArea());
        System.out.println("rect1 color: " + rect1.getColor());

        Circle circle1 = new Circle(5, "red");

        System.out.println("circle1 dimensions: radius = " + circle1.getRadius());
        System.out.println("circle1 area: " + circle1.calculateArea());
        System.out.println("circle1 perimeter: " + circle1.calculatePerimeter());
        System.out.println("circle1 color: " + circle1.getColor());
    }
}
