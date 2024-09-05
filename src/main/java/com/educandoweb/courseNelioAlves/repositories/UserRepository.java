package com.educandoweb.courseNelioAlves.repositories;

import com.educandoweb.courseNelioAlves.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
