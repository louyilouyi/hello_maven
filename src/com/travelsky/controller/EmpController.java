package com.travelsky.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.travelsky.annotation.Emp;

@Controller
public class EmpController {
	
	@RequestMapping("toUpdateEmp")
	public String toUpdate(Model model){
		System.out.println("toupdate执行");
		//去数据库加载原来输入的Emp信息
		Emp emp = new Emp();
		emp.setName("汪峰");
		emp.setAge(45);
		emp.setSex("M");
		emp.setCity("bj");
		emp.setFavor("4");
		emp.setFavs(new String[]{"b","c"});
		emp.setCitys(new String[]{"bj","tj","shh"});
		emp.setDescr("鸟巢演唱会，据说向章子怡求婚");
		
		model.addAttribute("emp",emp);
		return "updateEmp";
	}
	
	@ModelAttribute("cityMap")
	public Map<String,Object> getCities(){//会提前将数据添加到model中
		System.out.println("getCites执行");
		//喜爱的城市
		Map<String,Object> cityMap = new HashMap<String,Object>();
		cityMap.put("bj","北京");
		cityMap.put("tj","天津");
		cityMap.put("shh","上海");
		cityMap.put("gz","广州");
		return cityMap;
	}
}
