package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Emoloyee;

public interface EmployeeRepo extends JpaRepository<Emoloyee, Long> {

}
