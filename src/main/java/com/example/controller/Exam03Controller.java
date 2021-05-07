package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Exam03Form;

@Controller
@RequestMapping("/exam03")

public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@ModelAttribute
	public Exam03Form setUpForm() {
		return new Exam03Form();
	}

	@RequestMapping("/purchase")
	public String purchace() {
		return "exam03";
	}
	
	@RequestMapping("/show-amount")
	public String showAmount(@Validated Exam03Form form, BindingResult result) {
		
		if(result.hasErrors()) {
			return "exam03";
		}
		
		
		application.setAttribute("product1", form.getProduct1());
		application.setAttribute("product2", form.getProduct2());
		application.setAttribute("product3", form.getProduct3());
		
		Integer totalAmount = form.getProduct1() + form.getProduct2() + form.getProduct3();
		Integer taxIncludedAmount = (int) (totalAmount * 1.08);
		
		application.setAttribute("totalAmount", totalAmount);
		application.setAttribute("taxIncludedAmount", taxIncludedAmount);
		
		return "exam03-result";
		
		
		
		
		
	}
	
	
	

}
