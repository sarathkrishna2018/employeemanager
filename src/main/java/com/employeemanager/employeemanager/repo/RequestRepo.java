package com.employeemanager.employeemanager.repo;

import com.employeemanager.employeemanager.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepo extends JpaRepository<Request, Long>, RequestRepoCustom {

    Request findRequestById(Long id);

    void deleteRequestById(Long id);


    List<Request> getEmployeeRequests(String id);
}
