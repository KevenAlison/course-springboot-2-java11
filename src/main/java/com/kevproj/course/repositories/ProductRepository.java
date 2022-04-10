package com.kevproj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevproj.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
