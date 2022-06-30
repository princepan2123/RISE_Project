package com.project.projectManagement.repository;

import com.project.projectManagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUsername(String userName);

    User findUserByEmail(String email);
}
