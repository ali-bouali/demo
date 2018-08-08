package com.demo.controllers;

import com.demo.entities.User;
import com.demo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserRepository userRepo;

    @PostMapping(value = "/create")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }
}
