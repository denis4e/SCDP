package com.demo.scdp;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String buildFullName(String name, String lastName) {
        return name + lastName;
    }

}