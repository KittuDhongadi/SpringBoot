package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("home")
	//@ResponseBody
	public String home()
	{
		System.out.println("Home Page Hi...");
		return "home.jsp";
	}
}
