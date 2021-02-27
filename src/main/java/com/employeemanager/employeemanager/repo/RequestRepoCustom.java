package com.employeemanager.employeemanager.repo;

import com.employeemanager.employeemanager.model.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RequestRepoCustom {
    List<Request> getEmployeeRequests(String id);
}
