package com.pantowa.userservice.services;

import com.pantowa.userservice.VO.Depertment;
import com.pantowa.userservice.VO.ResponseTemplate;
import com.pantowa.userservice.entity.User;
import com.pantowa.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User save(User user) {
        log.info("inside service save method of userservice");
        return userRepository.save(user);
    }

    public ResponseTemplate getUserWithDepartment(Long id) {
        log.info("inside getUserWithDepartment of userservice");
        ResponseTemplate responseTemplate = new ResponseTemplate();
        User user = userRepository.findByUserId(id);
        Depertment depertment = restTemplate
                .getForObject("http://192.168.0.100:31000/department-service/departments/" + id, Depertment.class);
        responseTemplate.setUser(user);
        responseTemplate.setDepertment(depertment);
        return responseTemplate;
    }
}
