package com.company.springsecurityjdbc;

import com.company.springsecurityjdbc.entity.Role;
import com.company.springsecurityjdbc.entity.User;
import com.company.springsecurityjdbc.service.serviceInterface.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJdbcApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));

			userService.saveUser(new User(null, "jhon", "jhon","jhon@gmail.com",  "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "admin", "admin1", "admin@gmail.com", "12345", new ArrayList<>()));

			userService.addRoleToUser("jhon", "ROLE_USER");
			userService.addRoleToUser("admin1", "ROLE_ADMIN");
		};
	}

}
