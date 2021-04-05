package com.demo.scdp;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public String getUserFullName(User user) {
        return user.getName() + user.getLastName();
    }

    @Override
    public String buildFullName(String name, String lastName) {
        return name + lastName;
    }

    @Override
    public UserServiceImpl getBean(){
        return new UserServiceImpl();
    }
}