package com.bootcampexcercise.module10.activity2;

import com.bootcampexcercise.module10.activity1.Person;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private int salary;

    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee(String name, int age, String jobTitle, String company, int salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("I am an employee, my name is " + this.getName()
                + " and age is " + this.getAge()
                + " years old. I work as " + this.getJobTitle()
                + " in " + getCompany()
                + " and my salary is " + getSalary());
    }
}
