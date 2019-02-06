package com.rst.boot.services.impl;

import com.rst.boot.services.UserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices{

    @Override
    public String findAllUsers() {
        return "all users";
    }
}
