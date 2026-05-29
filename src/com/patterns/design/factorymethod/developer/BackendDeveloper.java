package com.patterns.design.factorymethod.developer;

import com.patterns.design.factorymethod.employee.Employee;

public class BackendDeveloper implements Employee {
    @Override
    public double getSalary() {
        return 100650D;
    }

    @Override
    public String getRole() {
        return "Backend Developer";
    }
}
