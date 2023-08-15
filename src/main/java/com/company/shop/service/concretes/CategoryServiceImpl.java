package com.company.shop.service.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.shop.entity.Category;
import com.company.shop.repository.CategoryRepository;
import com.company.shop.service.abstracts.CategoryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{
	
	private CategoryRepository categoryRepository;

	@Override
	public void create(Category category) {
		// business rules
		categoryRepository.save(category);
	}

	@Override
	public void update(Category category) {
		// business rules
		categoryRepository.save(category);
	}

	@Override
	public void delete(Integer id) {
		// business rules
		categoryRepository.delete(categoryRepository.findById(id).get());
	}

	@Override
	public List<Category> getAll() {
		// business rules
		return categoryRepository.findAll();
	}

}
