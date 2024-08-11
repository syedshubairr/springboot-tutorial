package com.dailycodebuffer.Spring_boot_tutorial.exception;

public class DepartmentNotFoundException extends Exception {

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}