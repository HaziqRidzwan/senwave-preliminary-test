package com.senwave.spt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register_page";
	}

}
