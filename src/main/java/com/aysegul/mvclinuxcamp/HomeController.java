package com.aysegul.mvclinuxcamp;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

	@RequestMapping("/")
	public String showHome() {
		return "home";
}
}
