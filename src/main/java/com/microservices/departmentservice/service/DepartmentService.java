package com.microservices.departmentservice.service;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentID) {
        log.info("inside getDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentID);
    }
}
