package com.example.BootLearning.service;

import com.example.BootLearning.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartment();

    public Department fetchDepartmentById(Long id);

    public void deleteDepartmentById(Long id);

    public Department updateDepartment(Long id, Department department);

//    public Department fetchDepartmentName(String deptName);

}
