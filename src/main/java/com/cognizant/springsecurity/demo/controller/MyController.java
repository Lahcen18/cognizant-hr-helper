package com.cognizant.springsecurity.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cognizant.springsecurity.demo.entity.User;
import com.cognizant.springsecurity.demo.service.UserService;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

	// my custom page
	@GetMapping("/mypage")
	public String showMyPage(Model theModel) {
        List<User> allUsers = userService.findAll();
        if (allUsers != null){
    		for (User item : allUsers) {
    			System.out.println("MyController: user-" + item.getId() + " - " + item);
    		}

        	theModel.addAttribute("users", allUsers);
        }
		theModel.addAttribute("myData", "Bonjour à tous!!");
		
		return "mypage";
	}

}










