package com.reviver.apirestfull.repository;

import com.reviver.apirestfull.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
