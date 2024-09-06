package com.educandoweb.courseNelioAlves.repositories;

import com.educandoweb.courseNelioAlves.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
