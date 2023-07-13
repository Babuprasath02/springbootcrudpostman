package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Products;
@Repository
public interface ProductRepository extends JpaRepository<Products,Long>{

}
