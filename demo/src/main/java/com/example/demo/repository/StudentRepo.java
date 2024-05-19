package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Students;

public interface StudentRepo extends JpaRepository<Students, Long> {

	/*
	 * public final static String GET_STUDENTS=
	 * "select* From students s join student_details sd on s.id = sd.id";
	 * 
	 * @Query(GET_STUDENTS) public List<Students> getAllStudent();
	 * 
	 */
	 
}
