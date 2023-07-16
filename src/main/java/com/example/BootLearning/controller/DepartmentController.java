package com.example.BootLearning.controller;

import com.example.BootLearning.entity.Department;
import com.example.BootLearning.service.DepartmentService;
import com.example.BootLearning.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    //DepartmentService service = new DepartmentServiceImpl();
    // instead of doing this below , we do the following.
    @Autowired
    private DepartmentService departmentService;


    //to save the department
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){

//        DepartmentService service = new DepartmentServiceImpl();
        return departmentService.saveDepartment(department);

    }

}
