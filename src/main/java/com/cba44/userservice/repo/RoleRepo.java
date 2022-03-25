package com.cba44.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cba44.userservice.domain.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
