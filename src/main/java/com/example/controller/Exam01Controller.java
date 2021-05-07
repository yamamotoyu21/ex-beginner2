package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/exam01")


public class Exam01Controller {
	

	
	@RequestMapping("/input")
	public String input() {
		return "exam01";
	}
	
	@RequestMapping("/receive-info")
	public String receiveInfo(String name,Model model) {
		model.addAttribute("name", name);
		
		return "exam01-result";
		
		
	}
	
	

}
