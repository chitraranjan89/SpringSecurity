package com.smart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

	@GetMapping("/login")
	public  String login() {
		System.out.print("Hit");
		return "Sucessfull login";
	}
	
}
