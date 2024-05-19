package com.example.demo.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Students;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("v1/students")
public class StudentController {
	
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/get")
	public ResponseEntity<java.util.List<Students>> getAllStudents(){
	     java.util.List<Students>student = studentService.getAllStudents();
		return new ResponseEntity<java.util.List<Students>>(student,HttpStatus.OK);
	
	}
	
	
	@PostMapping("/createStudent")
	public ResponseEntity<Students>createStudents(@RequestBody Students students){
	  Students student=studentService.createStudent(students); 
	  return new ResponseEntity<Students>(student,HttpStatus.CREATED);
				
	}
	
	   
	
	
	
	
	

}
