package com.example.BootLearning.controller;

import com.example.BootLearning.entity.Department;
import com.example.BootLearning.service.DepartmentService;
import com.example.BootLearning.service.DepartmentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    //DepartmentService service = new DepartmentServiceImpl();
    // instead of doing this below , we do the following.
    @Autowired
    private DepartmentService departmentService;


    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    //to save the department
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){

//        DepartmentService service = new DepartmentServiceImpl();
        LOGGER.info("inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/fetchDepartments")
    public List<Department> fetchDepartments(){
        LOGGER.info("inside fetchDepartments of DepartmentController");
        return departmentService.fetchDepartment();

    }

    @GetMapping("/fetchDepartments/{id}")
    public Department fetchDepartmentsById(@PathVariable("id") Long id){
        LOGGER.info("inside fetchDepartmentsById of DepartmentController");
        return departmentService.fetchDepartmentById(id);

    }

    @DeleteMapping("/deleteDepartments/{id}")
    public String deleteDepartmentsById(@PathVariable("id") Long id){
        LOGGER.info("inside deleteDepartmentsById of DepartmentController");
        departmentService.deleteDepartmentById(id);

        return "Record Deleted";
    }

    @PostMapping("/updateDepartments/{id}")
    public Department updateDepartment(@PathVariable("id") Long id,  Department department){
        LOGGER.info("inside updateDepartment of DepartmentController");
         return departmentService.updateDepartment(id,department);
        //return "record Updated";
    }

    //very important endpoint.
//    @PutMapping("/fetchDepartmentByName/name/{name}")
//    public Department fetchDepartmentName(@PathVariable("name") String departmentName){
//        return departmentService.fetchDepartmentName(departmentName);
//    }

}
