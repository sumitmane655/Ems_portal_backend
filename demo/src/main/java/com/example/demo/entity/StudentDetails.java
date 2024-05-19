package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "student_details")
@Data

public class StudentDetails   {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
    private long mob;
    private int roll_no;
    private String adress;
    
}
