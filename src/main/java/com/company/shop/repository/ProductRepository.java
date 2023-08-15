package com.company.shop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.shop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findAllByName(String name);
}
