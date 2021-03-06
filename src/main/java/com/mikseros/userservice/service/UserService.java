package com.mikseros.userservice.service;

import java.util.List;

import com.mikseros.userservice.domain.Role;
import com.mikseros.userservice.domain.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User>getUsers();
}
