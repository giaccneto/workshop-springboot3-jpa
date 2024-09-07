package com.educandoweb.courseNelioAlves.repositories;

import com.educandoweb.courseNelioAlves.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
