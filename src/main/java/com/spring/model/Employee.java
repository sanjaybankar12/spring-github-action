package com.spring.model;

import com.spring.annotation.EmployeeType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	@NotNull
	private Integer id;
	@NotBlank(message = "Name should not be blank")
	private String name;
	@NotBlank(message = "Dept should not be blank")
	private String dept;
	@Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
	private String phone;
	@Email(message = "Invalid Email id")
	private String email;
	@EmployeeType
	private String type;
	
}
