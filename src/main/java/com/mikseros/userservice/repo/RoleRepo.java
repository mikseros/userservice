package com.mikseros.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikseros.userservice.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{

	Role findByName(String name);
}
