package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Exam02Form;

@Controller
@RequestMapping("/exam02")

public class Exam02Controller {
	
	@Autowired
	private HttpSession session;
	
	@ModelAttribute
	public Exam02Form setUpForm() {
		return new Exam02Form();
	}
	
	@RequestMapping("/index")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/calc")
	public String calc(Exam02Form form) {
		session.setAttribute("num1", form.getNum1());
		session.setAttribute("num2", form.getNum2());
		
		Integer answer = form.getNum1() + form.getNum2();
		session.setAttribute("answer", answer);
		System.out.println(form.toString());
		return "exam02-result";
		
	}
	
	@RequestMapping("/toPage2")
	public String toPage2() {
		return "exam02-result2";
	}

}
