package com.cba44.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cba44.userservice.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
