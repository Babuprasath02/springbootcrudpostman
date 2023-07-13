package com.example.crud.service;

import java.util.List;

import com.example.crud.model.Products;

public interface ProductService {
	Products getById(long id);
	List<Products> getAll();
	Products save(Products prod);
	void delete(long id);
	Products update(Long id,Products prod);

}
