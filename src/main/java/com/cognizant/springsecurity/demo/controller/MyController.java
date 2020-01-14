package com.cognizant.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	// my custom page
	@GetMapping("/mypage")
	public String showMyPage(Model theModel) {
		
		theModel.addAttribute("myData", "Bonjour à tous!!");
		
		return "mypage";
	}

}










