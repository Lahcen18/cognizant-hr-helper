package com.cognizant.springsecurity.demo.dao;

import com.cognizant.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
