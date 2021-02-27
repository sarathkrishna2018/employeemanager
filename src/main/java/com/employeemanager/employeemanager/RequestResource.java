package com.employeemanager.employeemanager;

import com.employeemanager.employeemanager.model.Request;
import com.employeemanager.employeemanager.service.RequestService;
import com.employeemanager.employeemanager.model.Request;
import com.employeemanager.employeemanager.service.RequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestResource {

    private final RequestService requestService;

    public RequestResource(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Request>> getAllRequests(){
        List<Request> requests = requestService.findAllRequests();
        return new ResponseEntity<>(requests, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Request> getRequest(@PathVariable("id") Long id){
        Request request = requestService.findRequestById(id);
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Request> addRequest(@RequestBody Request request){
        Request newRequest = requestService.addRequest(request);
        return new ResponseEntity<>(newRequest, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Request> updateRequest(@RequestBody Request request){
        Request updateRequest = requestService.updateRequest(request);
        return new ResponseEntity<>(updateRequest, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public ResponseEntity<?> deleteRequestById(@PathVariable("id") Long id){
        requestService.deleteRequestById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
