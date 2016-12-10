package com.travelsky.annotation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * 注解@Phone的校验器，实现以下验证逻辑
 * 非空，而且必须是以13，15，18开始的手机号
 * @author soft01
 *
 */
public class PhoneValidator implements ConstraintValidator<Phone, String>{
	
	private String phoneReg = "^1[3|5|8]\\d{9}$";

	public void initialize(Phone arg0) {//初始化方法
		
	}

	//校验方法
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		//按验证规则编写校验逻辑
		
		//检查是否为空
		if(value==null||"".equals(value)){
			return false;
		}
		System.out.println("执行正确");
		//检查13，15，18格式
		Pattern phonePattern = Pattern.compile(phoneReg);//根据phoneeg正则表达式字符串生成一个Pattern
		Matcher matcher = phonePattern.matcher(value);
		System.out.println(matcher.matches());
		return matcher.matches();//返回是否匹配true匹配，false不匹配
	}

}
