package com.patterns.design.factory;

public class EmployeeFactory {

    public Employee getEmployee(EmployeeType employeeType){


        if(employeeType==EmployeeType.FRONTEND_DEVELOPER){
            return new FrontEndDeveloper();
        }
        else if(employeeType==EmployeeType.BACKEND_DEVELOPER) {
            return new BackendDeveloper();
        }
        else{
            return  null;
        }
    }
}
