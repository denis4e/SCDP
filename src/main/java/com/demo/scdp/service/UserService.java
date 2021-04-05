package com.demo.scdp.service;

import com.demo.scdp.domain.User;

public interface UserService {
    String getUserFullName(User user);

    String buildFullName(String name, String lastName);

    UserServiceImpl getBean();
}
