package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Students;

public interface StudentService {

	Students  createStudent(Students  students);
    List<Students> getAllStudents();
	/*
	 * Emoloyee getUserById(Long empId); void deleteEmployee(Long empId); Emoloyee
	 * updateEmployee(Emoloyee emoloyee);
	 */

	
}
