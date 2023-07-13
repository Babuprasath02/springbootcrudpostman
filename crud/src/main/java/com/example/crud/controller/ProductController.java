package com.example.crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Products;
import com.example.crud.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService prodService;
	
	@GetMapping("/getAll")
	public List<Products> getAll(){
		return prodService.getAll();
		
	}
	@GetMapping("/getById/{id}")
	public Products getById(@PathVariable long id) {
		return prodService.getById(id);
	}
	@PostMapping("/create")
	public Products save(@RequestBody Products product) {
		return prodService.save(product);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable long id) {
		prodService.delete(id);
	}
	@PutMapping("update/{id}")
	public Products updateProduct(@RequestBody Products prod,@PathVariable long id) {
		return prodService.update(id,prod);
	}

}
