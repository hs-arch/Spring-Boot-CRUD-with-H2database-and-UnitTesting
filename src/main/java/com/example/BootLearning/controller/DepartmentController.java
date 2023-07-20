package com.example.BootLearning.controller;

import com.example.BootLearning.entity.Department;
import com.example.BootLearning.service.DepartmentService;
import com.example.BootLearning.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/fetchDepartments")
    public List<Department> fetchDepartments(){
        return departmentService.fetchDepartment();

    }

    @GetMapping("/fetchDepartments/{id}")
    public Department fetchDepartmentsById(@PathVariable("id") Long id){
        return departmentService.fetchDepartmentById(id);

    }

    @DeleteMapping("/deleteDepartments/{id}")
    public String deleteDepartmentsById(@PathVariable("id") Long id){
        departmentService.deleteDepartmentById(id);

        return "Record Deleted";
    }

    @PostMapping("/updateDepartments/{id}")
    public Department updateDepartment(@PathVariable("id") Long id,  Department department){
         return departmentService.updateDepartment(id,department);
        //return "record Updated";
    }

    //very important endpoint.
//    @PutMapping("/fetchDepartmentByName/name/{name}")
//    public Department fetchDepartmentName(@PathVariable("name") String departmentName){
//        return departmentService.fetchDepartmentName(departmentName);
//    }

}
