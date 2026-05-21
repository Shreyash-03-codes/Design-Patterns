package com.patterns.design.factory;

public class FrontEndDeveloper implements Employee{

    @Override
    public double getSalary() {
        return 80500D;
    }

    @Override
    public String getRole() {
        return "Frontend Developer";
    }
}
