package com.cba44.userservice.service;

import java.util.List;

import com.cba44.userservice.domain.Role;
import com.cba44.userservice.domain.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User> getUsers();
}
