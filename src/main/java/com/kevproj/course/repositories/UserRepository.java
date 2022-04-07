package com.kevproj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevproj.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
