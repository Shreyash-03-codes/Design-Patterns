package com.patterns.design.factorymethod.developer;

import com.patterns.design.factorymethod.employee.Employee;

public class FrontEndDeveloper implements Employee {

    @Override
    public double getSalary() {
        return 80500D;
    }

    @Override
    public String getRole() {
        return "Frontend Developer";
    }
}
