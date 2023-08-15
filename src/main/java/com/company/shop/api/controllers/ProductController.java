package com.company.shop.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.shop.entity.Product;
import com.company.shop.service.abstracts.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("product")
@AllArgsConstructor
public class ProductController {
	private ProductService productService;
	
	@PostMapping()
	public void create(@RequestBody Product product) {
		productService.create(product);
	}
	
	@PutMapping
	public void update(@RequestBody Product product) {
		productService.update(product);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		productService.delete(id);
	}
	
	@GetMapping
	public List<Product> getAll(){
		return productService.getAll();
	}
}
