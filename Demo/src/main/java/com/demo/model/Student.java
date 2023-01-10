package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public Student() {
		
		System.out.println("Student class constructor ...");
	}
	
	public void details() {
		System.out.println("student details are ......!!!");
	}

}
