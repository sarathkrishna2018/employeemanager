package com.employeemanager.employeemanager.service;

import com.employeemanager.employeemanager.exception.EmployeeNotFoundException;
import com.employeemanager.employeemanager.exception.ManagerNotFoundException;
import com.employeemanager.employeemanager.exception.RequestNotFoundException;
import com.employeemanager.employeemanager.model.Employee;
import com.employeemanager.employeemanager.model.Request;
import com.employeemanager.employeemanager.repo.EmployeeRepo;
import com.employeemanager.employeemanager.repo.RequestRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    private final RequestRepo requestRepo;

    public EmployeeService(EmployeeRepo employeeRepo, RequestRepo requestRepo){
        this.employeeRepo = employeeRepo;
        this.requestRepo = requestRepo;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee by ID " + id + " was not found"));
    }

    public Employee findEmployeeByEmpId(String id){
        return employeeRepo.findEmployeeByEmpId(id).orElseThrow(() -> new EmployeeNotFoundException("Employee by Employee ID " + id + " was not found"));
    }

    public Employee getManager(String id) {
        Employee employee = new Employee();
        employee = findEmployeeByEmpId(id);
        return employeeRepo.findEmployeeByEmpId(employee.getManager()).orElseThrow(() -> new ManagerNotFoundException("Employee by Employee ID " + id + " was not found"));
    }

    public void deleteEmployeeById(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }


    public List<Request> getEmployeeRequests(String id) {
        return requestRepo.getEmployeeRequests(id);
    }
}
