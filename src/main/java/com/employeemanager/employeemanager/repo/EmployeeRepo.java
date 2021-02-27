package com.employeemanager.employeemanager.repo;

import com.employeemanager.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeById(Long id);
    Optional<Employee> findEmployeeByEmpId(String id);
    void deleteEmployeeById(Long id);
}
