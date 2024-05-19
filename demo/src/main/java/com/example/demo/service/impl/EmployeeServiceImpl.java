package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Emoloyee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	
	@Override
	public Emoloyee createEmployee(Emoloyee emoloyee) {
		return employeeRepo.save(emoloyee);
	}


	@Override
	public List<Emoloyee> getEmployee() {
		return employeeRepo.findAll();	
	}


	@Override
	public Emoloyee getUserById(Long empId) {
		// TODO Auto-generated method stub
		Optional<Emoloyee> optionalEmp =employeeRepo.findById(empId);
		return optionalEmp.get();
	}


	@Override
	public void deleteEmployee(Long empId) {
		// TODO Auto-generated method stub
	 employeeRepo.deleteById(empId);
		
	}


	@Override
	public Emoloyee updateEmployee(Emoloyee emoloyee) {
		// TODO Auto-generated method stub
	Emoloyee existingEmp  =employeeRepo.findById(emoloyee.getId()).get();
	existingEmp.setFirstName(emoloyee.getFirstName());
	existingEmp.setLastName(emoloyee.getLastName());
	existingEmp.setEmail(emoloyee.getEmail());
	Emoloyee updatedEmp = employeeRepo.save(existingEmp);
		return updatedEmp;
	}
	
	
	
	
	
	

	
	
	
	





}
