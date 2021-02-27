package com.employeemanager.employeemanager.model;

import javax.persistence.Entity;
import java.util.List;


public class Manager {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
