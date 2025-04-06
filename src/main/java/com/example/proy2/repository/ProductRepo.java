package com.example.proy2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proy2.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
