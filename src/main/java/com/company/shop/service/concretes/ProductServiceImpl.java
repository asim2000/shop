package com.company.shop.service.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.shop.entity.Product;
import com.company.shop.repository.ProductRepository;
import com.company.shop.service.abstracts.ProductService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;

	@Override
	public void create(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void update(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(Integer id) {
		productRepository.delete(productRepository.findById(id).get());
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}
}
