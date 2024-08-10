package com.dailycodebuffer.Spring_boot_tutorial.service;

import com.dailycodebuffer.Spring_boot_tutorial.exception.DepartmentNotFoundException;
import com.dailycodebuffer.Spring_boot_tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> fetchAllDepartments();

    public Department saveDepartment(Department department);

    public Department fetchDepartmentId(Long departmentID) throws DepartmentNotFoundException;

    public boolean deleteDepartmentByID(Long departmentID);

    public Department updateDepartment(Long departmentID, Department department);

    public Department getDeptByName(String deptName) throws DepartmentNotFoundException;
}
