package com.jerrymvc.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	//這個地方控制首頁在哪裡
	@RequestMapping("/")
	public String goSomeWhere() {
		return "index";
	}
	
	@GetMapping(value = "/showform")
	public String showAllStudents() {
		return "student_form";
	}

}
