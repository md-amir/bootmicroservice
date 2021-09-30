package com.pantowa.departmentservice.services;

import com.pantowa.departmentservice.entity.Department;
import com.pantowa.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("inside of savedepartment method of department service");
        return repository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("indside findbyid method of department service");
        return repository.findByDeptId(id);
    }
}
