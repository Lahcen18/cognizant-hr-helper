package com.cognizant.springsecurity.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cognizant.springsecurity.demo.entity.User;
import com.cognizant.springsecurity.demo.user.CrmUser;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
