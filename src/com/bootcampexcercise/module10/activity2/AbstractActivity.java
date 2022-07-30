package com.bootcampexcercise.module10.activity2;

public class AbstractActivity {
    public static void main(String[] args) {
        Employee empl1 = new Employee("John", 25, "Web developer", "Accenture", 2000);
        Student stud1 = new Student("Sam", 22, "RTU");

        empl1.introduce();
        stud1.introduce();
    }
}
