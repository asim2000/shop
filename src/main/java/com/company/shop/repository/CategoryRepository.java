package com.company.shop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.shop.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
}
