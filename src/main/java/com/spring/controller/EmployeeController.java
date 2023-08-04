package com.spring.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.config.AppConfig;
import com.spring.model.Employee;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Value("${message:default value}")
	private String message;
	
	@Value("${fruits}")
	private List<String> fruits;
	
	@Value("#{${data}}")
	private Map<String, String> data;
	
	@Autowired
	private AppConfig appConfig;

	@GetMapping
	public String home() {
		return message + fruits + data + appConfig;
	}
	
	@PostMapping
	public void addEmployee(@RequestBody @Valid Employee employee) {
		logger.info(employee.toString());
	}
}
