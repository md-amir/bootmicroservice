package com.pantowa.userservice.controller;

import com.pantowa.userservice.VO.ResponseTemplate;
import com.pantowa.userservice.entity.User;
import com.pantowa.userservice.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside  save method of user controller");
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable Long id){
        log.info("inside getUserWithDepartment of user controller");
        return userService.getUserWithDepartment(id);
    }
}
