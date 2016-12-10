package com.travelsky.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	//进入addser.jsp
	@RequestMapping("toAdd")
	public String toAddUser(Model model){
		model.addAttribute("user",new User());
		return "adduser";
	}
	
	//处理提交按钮
	@RequestMapping("add")
	public String addUser(
			@Valid User user,
			BindingResult errors,
			Model model){
		//加上Valid后，会合User类联系起来    会把信息加载到指定页面，但默认是报异常的，加上BindingResult后，会把信息交给BindingResult
		//BindingResult必须紧跟在@Valid,  多个user对象时，多个BindingResult

		//将user写入模型
		model.addAttribute("user",user);//指定的是页面的commandName属性
		
		//检测errors如果有错误，返回addUser.jsp注册页面
		if(errors.hasErrors()){
			return "adduser";
		}
		//接收表单信息，写入DB表
		System.out.println(user.getUsername());
		System.out.println("利用JDBC技术将数据写入数据库");
		return "ok"; 
	}
}
