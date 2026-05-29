package com.patterns.design.factorymethod;

import com.patterns.design.factorymethod.employee.Employee;
import com.patterns.design.factorymethod.enums.EmployeeType;
import com.patterns.design.factorymethod.factory.EmployeeFactory;

public class Main {
    public static void main(String[] args) {
//        Employee employee1=new FrontEndDeveloper();
//        Employee employee2=new BackendDeveloper();


        EmployeeFactory employeeFactory=new EmployeeFactory();

        System.out.println("---------------------");

        Employee employee3=employeeFactory.getEmployee(EmployeeType.FRONTEND_DEVELOPER);
        System.out.println(employee3.getRole());
        System.out.println(employee3.getSalary());

        System.out.println("---------------------");

        Employee employee4=employeeFactory.getEmployee(EmployeeType.BACKEND_DEVELOPER);
        System.out.println(employee4.getRole());
        System.out.println(employee4.getSalary());


    }
}
