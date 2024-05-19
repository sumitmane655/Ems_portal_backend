package com.example.demo.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Emoloyee;
import com.example.demo.entity.Students;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
@Service
public class StudentImpl  implements StudentService{
	@Autowired
   StudentRepo studentRepo;
	
	
	@Override
	public Students createStudent(Students students) {
		// TODO Auto-generated method stub
		return studentRepo.save(students);
	}

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	
	


   
	

}
