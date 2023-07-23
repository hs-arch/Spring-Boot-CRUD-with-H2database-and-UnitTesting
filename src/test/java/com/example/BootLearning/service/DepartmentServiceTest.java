package com.example.BootLearning.service;

import com.example.BootLearning.entity.Department;
import com.example.BootLearning.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {

        Department department = Department.builder()
                .departmentAddress("XYZ")
                .departmentCode("11-06")
                .departmentName("IT")
                .departmentId(1L) // 1 L means value is 1 which is of Long type.
                .build();

//        Mockito.when(departmentRepository.findById(1L)).thenReturn(Department);

    }

    @Test
    void saveDepartment() {
    }

    @Test
    void fetchDepartment() {
    }

    @Test
    void fetchDepartmentById() {
        long departmentId = 1;
        Department found = departmentService.fetchDepartmentById(departmentId);

        assertEquals(departmentId, found.getDepartmentId());
    }

    @Test
    void deleteDepartmentById() {
    }

    @Test
    void updateDepartment() {
    }
}