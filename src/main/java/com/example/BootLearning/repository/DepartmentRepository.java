package com.example.BootLearning.repository;

import com.example.BootLearning.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


    // while creating this findBy (my methods names is fetchByDepartmentname),
    // hence on putting them together we get findByfetchDepartmentByName.
    // but to method naming conventions we need camel case so we will upper case the F of fetch.
    // hence our actual method name when creating our own findBy will be findByFetchByDepartmentName

    // when we do this, spring automatically reads the method as a findBy method and reads our data back
    // hence how to get the data, that implementation from our side is not required.
    // Spring Power !!!


//    public Department findByFetchDepartmentName(String deptName);

}
