package com.company.shop.service.abstracts;

import java.util.List;

import com.company.shop.entity.Product;

public interface ProductService {
	
	void create(Product product);
	
	void update(Product product);
	
	void delete(Integer id);
	
	List<Product> getAll();
}
