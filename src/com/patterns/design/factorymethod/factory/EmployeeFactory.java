package com.patterns.design.factorymethod.factory;

import com.patterns.design.factorymethod.developer.BackendDeveloper;
import com.patterns.design.factorymethod.developer.FrontEndDeveloper;
import com.patterns.design.factorymethod.employee.Employee;
import com.patterns.design.factorymethod.enums.EmployeeType;

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
