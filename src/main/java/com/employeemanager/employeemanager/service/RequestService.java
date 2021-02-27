package com.employeemanager.employeemanager.service;

import com.employeemanager.employeemanager.exception.ManagerNotFoundException;
import com.employeemanager.employeemanager.exception.RequestNotFoundException;
import com.employeemanager.employeemanager.model.Request;
import com.employeemanager.employeemanager.repo.RequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RequestService {
    private final RequestRepo requestRepo;

    @Autowired
    public RequestService(RequestRepo requestRepo) {
        this.requestRepo = requestRepo;
    }

    public Request addRequest(Request request){
        return requestRepo.save(request);
    }

    public List<Request> findAllRequests(){
        return requestRepo.findAll();
    }

    public Request updateRequest(Request request){
        return requestRepo.save(request);
    }

    public Request findRequestById(Long id){
        return requestRepo.findRequestById(id);
    }

    public void deleteRequestById(Long id) {
        requestRepo.deleteRequestById(id);
    }
}
