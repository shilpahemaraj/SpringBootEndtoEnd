package com.techdoodle.eventmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdoodle.eventmanagement.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
