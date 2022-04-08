package com.kevproj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevproj.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
