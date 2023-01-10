package com.neosoft.exception.handling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
	
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private String age;
	private String nationality;

}
