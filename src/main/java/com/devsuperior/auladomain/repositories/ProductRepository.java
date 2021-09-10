package com.devsuperior.auladomain.repositories;

import com.devsuperior.auladomain.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
