package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.form.Exam04Form;

@Controller
@RequestMapping("/exam04")

public class Exam04Controller {
	
	@Autowired
	private ServletContext application;
	
	@ModelAttribute
	public Exam04Form setUpForm() {
		return new Exam04Form();
	}
	
	@RequestMapping("/input")
	public String input() {
		return "Exam04";
	}
	
	@RequestMapping("/receive-info")
	public String receiveInfo(
			@Validated Exam04Form form,
			BindingResult result
			) {
			
			if(result.hasErrors()) {
				return "Exam04";
			}
			
			application.setAttribute("name", form.getName());
			application.setAttribute("age", form.getAge());
			application.setAttribute("comment", form.getComment());
			
			return "exam04-result";
				
			}
	}
	
	


