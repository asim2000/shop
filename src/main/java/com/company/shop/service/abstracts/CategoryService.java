package com.company.shop.service.abstracts;

import java.util.List;

import com.company.shop.entity.Category;

public interface CategoryService {
	void create(Category category);
	void update(Category category);
	void delete(Integer id);
	List<Category> getAll();
}
