package com.cognizant.springsecurity.demo.dao;

import java.util.List;

import com.cognizant.springsecurity.demo.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    List<User> findAll();

    void save(User user);
    
}
