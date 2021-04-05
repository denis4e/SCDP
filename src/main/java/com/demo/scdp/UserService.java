package com.demo.scdp;

public interface UserService {
    String getUserFullName(User user);

    String buildFullName(String name, String lastName);

    UserServiceImpl getBean();
}
