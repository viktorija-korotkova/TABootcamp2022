package com.bootcampexcercise.module10.activity2;

import com.bootcampexcercise.module10.activity1.Person;

public class Student extends Person {
    private String schoolName;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("I am student, my name is " + getName()
                + ". I am " + getAge()
                + " years old. I study in university - " + this.getSchoolName());
    }
}
