package com.employeemanager.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String empId;
    private String department;
    private Boolean isManager;
    private Boolean isHR;
    private String manager;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", department='" + department + '\'' +
                ", isManager=" + isManager +
                ", isHR=" + isHR +
                ", manager='" + manager + '\'' +
                '}';
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }



    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getIsHR() {
        return isHR;
    }

    public void setHR(Boolean isHR) {
        isHR = isHR;
    }

    public void setManager(Boolean isManager) {
        isManager = isManager;
    }

    public Boolean getIsManager() {
        return isManager;
    }
}
