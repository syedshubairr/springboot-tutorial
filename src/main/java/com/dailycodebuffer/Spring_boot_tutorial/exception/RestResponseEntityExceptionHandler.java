package com.dailycodebuffer.Spring_boot_tutorial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundException departmentNotFoundException) {
        ErrorMessage errorMessage = ErrorMessage.builder().message(departmentNotFoundException.getMessage()).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

}
