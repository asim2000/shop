package com.company.shop.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.shop.entity.Category;
import com.company.shop.service.abstracts.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("category")
@AllArgsConstructor
public class CategoryController {
	
	private CategoryService categoryService;
	
	@PostMapping
	public void create(@RequestBody Category category) {
		categoryService.create(category);
	}
	@PutMapping
	public void update(@RequestBody Category category) {
		categoryService.update(category);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		categoryService.delete(id);
	}
	@GetMapping
	public List<Category> getAll(){
		return categoryService.getAll();
	}
}
