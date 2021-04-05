package com.demo.scdp;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserFullName(User user) {
        return user.getName() + user.getLastName();
    }

    public String buildFullName(String name, String lastName) {
        return name + lastName;
    }
}