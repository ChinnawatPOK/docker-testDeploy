package com.example.deployspring.controller;

import com.example.deployspring.Repository.UserRepository;
import com.example.deployspring.model.User;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/user")
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
