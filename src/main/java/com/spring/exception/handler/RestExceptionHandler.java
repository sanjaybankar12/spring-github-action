package com.spring.exception.handler;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValidEx(MethodArgumentNotValidException ex) {
		Map<String, String> hm = new LinkedHashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(e -> {
			hm.put(e.getField(), e.getDefaultMessage());
		});
		return hm;
	}
}
