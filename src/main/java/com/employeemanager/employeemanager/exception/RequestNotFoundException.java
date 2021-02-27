package com.employeemanager.employeemanager.exception;

public class RequestNotFoundException extends RuntimeException{
    public RequestNotFoundException(String message) {
        super(message);
    }
}
