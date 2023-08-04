package com.spring.annotation;

import java.util.Arrays;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmployeeTypeValidator implements ConstraintValidator<EmployeeType, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return Arrays.asList("A","B","C").contains(value);
	}

}
