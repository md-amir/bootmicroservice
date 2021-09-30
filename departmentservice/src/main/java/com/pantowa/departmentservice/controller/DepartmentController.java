package com.pantowa.departmentservice.controller;

import com.pantowa.departmentservice.entity.Department;
import com.pantowa.departmentservice.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside of savedepartment method of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long id){
        log.info("indside findbyid method of department controller");
        return departmentService.findDepartmentById(id);
    }
}
