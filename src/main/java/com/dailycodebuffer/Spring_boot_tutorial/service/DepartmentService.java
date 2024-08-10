package com.dailycodebuffer.Spring_boot_tutorial.service;

import com.dailycodebuffer.Spring_boot_tutorial.dto.request.DeptByNameRequestDTO;
import com.dailycodebuffer.Spring_boot_tutorial.dto.response.DepartmentResponseDTO;
import com.dailycodebuffer.Spring_boot_tutorial.exception.DepartmentNotFoundException;
import com.dailycodebuffer.Spring_boot_tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
     List<Department> fetchAllDepartments();

     Department saveDepartment(Department department);

     Department fetchDepartmentId(Long departmentID) throws DepartmentNotFoundException;

     boolean deleteDepartmentByID(Long departmentID);

     Department updateDepartment(Long departmentID, Department department);

     DepartmentResponseDTO getDeptByName(DeptByNameRequestDTO request) throws DepartmentNotFoundException;
}
