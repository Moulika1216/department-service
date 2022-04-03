package com.microservices.departmentservice.controller;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("inside saveDepartment of DepartmentController");
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/getById/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentID){
        log.info("inside getDepartmentById of DepartmentController");
        return departmentService.getDepartmentById(departmentID);
    }
}
