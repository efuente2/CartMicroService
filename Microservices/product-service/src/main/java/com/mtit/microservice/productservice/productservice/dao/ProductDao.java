package com.mtit.microservice.productservice.productservice.dao;

import com.mtit.microservice.productservice.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
