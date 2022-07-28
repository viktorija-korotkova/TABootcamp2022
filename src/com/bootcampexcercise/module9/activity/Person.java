package com.bootcampexcercise.module9.activity;

public class Person {

    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    public double getBodyMassIndex(int weight, float height) {
        if (weight > 0 && weight < 200 && height > 0 && height < 250) {
            return weight/Math.pow(height, 2);
        }

        return 0;
    }


        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)

    public String getBodyMassIndexAsString(int weight, float height) {
        if (weight > 0 && weight < 200 && height > 0 && height < 250) {
            return "BMI index:" + weight/(Math.pow(height, 2));
        }

        return "Invalid input, couldn't calculate the BMI";
    }

}
