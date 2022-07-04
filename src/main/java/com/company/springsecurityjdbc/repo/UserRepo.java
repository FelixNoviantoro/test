package com.company.springsecurityjdbc.repo;

import com.company.springsecurityjdbc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
