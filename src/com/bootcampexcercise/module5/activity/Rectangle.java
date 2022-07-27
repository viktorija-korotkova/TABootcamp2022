package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth, String color) {
        this.length = length;
        this.breadth = breadth;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return (length + breadth) * 2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
