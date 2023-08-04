package com.spring.model;

import java.util.List;
import java.util.Map;

import com.spring.config.AppConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String username;
	private String password;
}
