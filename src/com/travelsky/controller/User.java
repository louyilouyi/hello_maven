package com.travelsky.controller;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import com.travelsky.annotation.Phone;

public class User {
	@NotEmpty(message = "用户名不能为空")
	private String username;// 对应jsp from中组件的name属性
	@Size(min = 6, max = 10, message = "密码位数必须在{min}-{max}之间")
	private String password;
	@Phone(message = "电话号码的格式必须是13，15，18开头")
	private String phone;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
