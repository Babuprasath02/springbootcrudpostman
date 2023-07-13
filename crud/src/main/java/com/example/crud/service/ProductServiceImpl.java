package com.example.crud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.model.Products;
import com.example.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepo;
	@Override
	public Products getById(long id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Products save(Products prod) {
		// TODO Auto-generated method stub
		return productRepo.save(prod);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
		
	}

	@Override
	public Products update(Long id,Products prod) {
		Products existprod = productRepo.findById(id).orElse(new Products());
		
		existprod.setName(prod.getName());
		existprod.setDescription(prod.getDescription());
		existprod.setActive(prod.isActive());
		existprod.setImageUrl(prod.getImageUrl());
		existprod.setPrice(prod.getPrice());
		existprod.setSku(prod.getSku());
		Products updatedProduct = productRepo.saveAndFlush(existprod);
		return updatedProduct;
	}

}
