package com.spring.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.spring.model.Employee;
import com.spring.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@ConfigurationProperties("server")
public class AppConfig {

	private List<String> users;
	private Map<String, Employee> employees;
	private Map<String, User> userlist;
}
