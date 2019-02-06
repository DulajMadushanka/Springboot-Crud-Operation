package com.rst.boot.controller;

import com.rst.boot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public String allUsers(){
        return userServices.findAllUsers();
    }
}
