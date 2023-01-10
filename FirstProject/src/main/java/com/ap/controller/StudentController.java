package com.ap.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class StudentController {
	
	@RequestMapping("/get")
	public List<String> getDetail(){
		List<String> l=new ArrayList();
		l.add("akshay");
		l.add("ashok");
		l.add("patil");
		
		return l;
	}

}
