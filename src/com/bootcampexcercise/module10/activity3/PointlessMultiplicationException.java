package com.bootcampexcercise.module10.activity3;

public class PointlessMultiplicationException extends Exception {
    @Override
    public String getMessage() {
        return "One of the multiplication arguments is 1, the multiplication is pointless.";
    }
}
