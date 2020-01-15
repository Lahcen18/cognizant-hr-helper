package com.cognizant.springsecurity.demo.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cognizant.springsecurity.demo.entity.User;
import com.cognizant.springsecurity.demo.user.CrmUser;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    List<User> findAll();

    void save(CrmUser crmUser);
}
