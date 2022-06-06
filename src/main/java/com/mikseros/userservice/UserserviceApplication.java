package com.mikseros.userservice;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mikseros.userservice.domain.Role;
import com.mikseros.userservice.domain.User;
import com.mikseros.userservice.service.UserService;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			
			userService.saveUser(new User(null, "John", "john", "123", new ArrayList<>()));
			userService.saveUser(new User(null, "Mike", "mike", "123", new ArrayList<>()));
			userService.saveUser(new User(null, "Rudolph", "rudy", "123", new ArrayList<>()));
			userService.saveUser(new User(null, "Thomas", "tom", "123", new ArrayList<>()));
			
			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("john", "ROLE_MANAGER");
			userService.addRoleToUser("mike", "ROLE_MANAGER");
			userService.addRoleToUser("rudy", "ROLE_ADMIN");
			userService.addRoleToUser("rudy", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("rudy", "ROLE_USER");
			userService.addRoleToUser("tom", "ROLE_SUPER_ADMIN");
		};
	}
}
