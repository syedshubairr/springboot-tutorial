package com.dailycodebuffer.Spring_boot_tutorial.service;

import com.dailycodebuffer.Spring_boot_tutorial.model.Department;
import com.dailycodebuffer.Spring_boot_tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> fetchAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department fetchDepartmentId(Long departmentID) {
        return departmentRepository.findById(departmentID).get();
    }

    @Override
    public boolean deleteDepartmentByID(Long departmentID) {
        if (departmentRepository.existsById(departmentID)) {
            departmentRepository.deleteById(departmentID);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Department updateDepartment(Long departmentID, Department department) {
        Department depDB = departmentRepository.findById(departmentID).get();
        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(depDB);
    }

    @Override
    public Department getDeptByName(String deptName) {
        return departmentRepository.findByDepartmentName(deptName);
    }
}
