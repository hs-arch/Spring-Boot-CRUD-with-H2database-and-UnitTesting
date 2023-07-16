package com.example.BootLearning.service;

import com.example.BootLearning.entity.Department;
import com.example.BootLearning.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department){

        //this .save method is called from the JPA class. which was extended by the department repositoy interface
        //we created the reference of interface above and autowired it.
        // auwired it means we made the new object of the JPA class and passed it to above depertmentRepository reference.

        return departmentRepository.save(department);
    }
}
