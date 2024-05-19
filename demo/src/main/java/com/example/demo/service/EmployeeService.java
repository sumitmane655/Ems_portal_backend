package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Emoloyee;

public interface EmployeeService  {
	
	Emoloyee createEmployee(Emoloyee emoloyee);
    List<Emoloyee> getEmployee();
    Emoloyee getUserById(Long empId);
    void deleteEmployee(Long empId);
    Emoloyee updateEmployee(Emoloyee emoloyee);
	
	
	

}
