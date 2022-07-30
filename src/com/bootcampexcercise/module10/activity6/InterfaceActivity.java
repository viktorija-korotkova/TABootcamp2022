package com.bootcampexcercise.module10.activity6;

public class InterfaceActivity {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();

        bike.start();
        car.start();

        bike.stop();
        car.stop();
    }
}
