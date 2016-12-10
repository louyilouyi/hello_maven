package com.travelsky.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD,ElementType.METHOD})//约束位置为成员属性前或者对应的set方法前
@Retention(RetentionPolicy.RUNTIME)//约束为   运行时约束
@Constraint(validatedBy=PhoneValidator.class)//
public @interface Phone {
	String message() default "";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};
}
