package com.sa.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sa.core.entity.User;
import com.sa.core.repository.RolRepository;
import com.sa.core.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RolRepository rolRepository;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("userList", userService.getAllUser());
		model.addAttribute("roles", rolRepository.findAll());
		
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}	
}
