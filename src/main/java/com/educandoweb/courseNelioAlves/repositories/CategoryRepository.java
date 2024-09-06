package com.educandoweb.courseNelioAlves.repositories;

import com.educandoweb.courseNelioAlves.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
