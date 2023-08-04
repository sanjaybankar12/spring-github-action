package com.spring.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy=EmployeeTypeValidator.class)
public @interface EmployeeType {

	String message() default "Employee type must be A, B or C";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
