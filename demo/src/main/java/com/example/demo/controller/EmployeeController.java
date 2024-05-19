package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Emoloyee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;
@CrossOrigin("*")
@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping
	public ResponseEntity<Emoloyee> createUser(@RequestBody Emoloyee emoloyee){
		Emoloyee savedEmoloyee = employeeService.createEmployee(emoloyee);
		return new ResponseEntity<Emoloyee>(savedEmoloyee,HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity<List<Emoloyee>>getAllEmp(){	
	List<Emoloyee> allemoloyees =employeeService.getEmployee();
	return new ResponseEntity<List<Emoloyee>>(allemoloyees,HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Emoloyee> getEmpById(@PathVariable("id") Long EmpId){
	Emoloyee emoloyee	= employeeService.getUserById(EmpId);
	return new ResponseEntity<Emoloyee>(emoloyee,HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public void deleteEmpById(@PathVariable("id")Long id){
		employeeService.deleteEmployee(id);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity <Emoloyee>updateEmp(@PathVariable("id") Long id,@RequestBody Emoloyee emoloyee){
	emoloyee.setId(id);
	Emoloyee updatedEmoloyee=employeeService.updateEmployee(emoloyee);
	 return new ResponseEntity<Emoloyee>(updatedEmoloyee,HttpStatus.OK);
	}
	
	
	
	
	

}
