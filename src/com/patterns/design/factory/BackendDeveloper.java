package com.patterns.design.factory;

public class BackendDeveloper implements Employee{
    @Override
    public double getSalary() {
        return 100650D;
    }

    @Override
    public String getRole() {
        return "Backend Developer";
    }
}
