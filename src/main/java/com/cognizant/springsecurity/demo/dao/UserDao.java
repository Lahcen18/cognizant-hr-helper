package com.cognizant.springsecurity.demo.dao;

import com.cognizant.springsecurity.demo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
