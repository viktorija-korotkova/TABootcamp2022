package com.bootcampexcercise.module10.activity4;

import com.bootcampexcercise.module10.activity2.Employee;

import java.util.ArrayList;

public class EmployeeList {
    public static void main(String[] args) {
        Employee employee1 = new Employee("QA Lead", "CompanyName1", 3000);
        Employee employee2 = new Employee("Business analyst", "CompanyName1", 2000);
        Employee employee3 = new Employee( "Backend developer", "CompanyName1", 2500);
        Employee employee4 = new Employee("Team Lead", "CompanyName1", 5000);
        Employee employee5 = new Employee( "Frontend developer", "CompanyName1", 3000);

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        System.out.println("The employee whose salary is the highest is " + getHighestPaidEmployee(empList).getJobTitle());
    }

    public static Employee getHighestPaidEmployee(ArrayList<Employee> list) {
        Employee employeeToReturn = null;
        double salaryTemp = 0;
        for (Employee employee : list) {
            if (employee.getSalary() > salaryTemp) {
                employeeToReturn = employee;
                salaryTemp = employee.getSalary();
            }
        }

        return employeeToReturn;
    }
}
