package com.mikseros.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikseros.userservice.domain.User;

public interface UserRepo extends JpaRepository<User, Long>{

	User findByUserName(String username);
}
