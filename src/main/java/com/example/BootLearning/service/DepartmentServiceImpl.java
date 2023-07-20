package com.example.BootLearning.service;

import com.example.BootLearning.entity.Department;
import com.example.BootLearning.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<Department> fetchDepartment(){
        return departmentRepository.findAll();
    }

    public Department fetchDepartmentById(Long id){
//        return departmentRepository.getById(id);
            return departmentRepository.findById(id).get();
    }

    public void deleteDepartmentById(Long id){
        departmentRepository.deleteById(id);
    }

    public Department updateDepartment(Long id, Department department){
        Department departmentValue = departmentRepository.findById(id).get();

        // Check if the values of department name currently present in record is not null
         if(Objects.nonNull(departmentValue.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName()))
        {
            departmentValue.setDepartmentName(department.getDepartmentName());
        }

        // Check if the values of department Address currently present in record is not null
        if(Objects.nonNull(departmentValue.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress()))
        {
            departmentValue.setDepartmentAddress(department.getDepartmentAddress());
        }

        // Check if the values of department Code currently present in record is not null
//        if(Objects.nonNull(departmentValue.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode()))
//        {
            departmentValue.setDepartmentCode(department.getDepartmentCode());
        //}

        return departmentRepository.save(departmentValue);

    }

}
