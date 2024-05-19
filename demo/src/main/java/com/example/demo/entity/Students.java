package com.example.demo.entity;

import org.hibernate.annotations.DialectOverride.GeneratedColumn;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name= "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Students  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String first_name;
	private String last_name;
	private String email;
	/*
	 * @OneToOne(cascade =CascadeType.ALL, fetch = FetchType.LAZY) private
	 * StudentDetails studentdetails;
	 */
	
}
