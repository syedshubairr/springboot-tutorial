package com.dailycodebuffer.Spring_boot_tutorial.controller;

import com.dailycodebuffer.Spring_boot_tutorial.exception.DepartmentNotFoundException;
import com.dailycodebuffer.Spring_boot_tutorial.entity.Department;
import com.dailycodebuffer.Spring_boot_tutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    private final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
//        By this we are taking control to ourselves, but we are now using Springboot, so we can do this same by Autowire.
//        DepartmentService service = new DepartmentServiceImpl();
        log.info("Saving department at DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        log.info("fetchDepartmentList at DepartmentController");
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentID) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentId(departmentID);
    }

    @DeleteMapping("/departments/{id}")
    public ResponseEntity<Void> deleteDepartmentById(@PathVariable("id") Long departmentID) {
        if (departmentService.deleteDepartmentByID(departmentID)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentID, @RequestBody Department department) {
        return departmentService.updateDepartment(departmentID, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDeptByName(@PathVariable("name") String DeptName) throws DepartmentNotFoundException {
        return departmentService.getDeptByName(DeptName);
    }
}
