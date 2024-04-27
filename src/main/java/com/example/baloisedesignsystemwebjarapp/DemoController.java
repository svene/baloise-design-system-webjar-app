package com.example.baloisedesignsystemwebjarapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class DemoController {

	@GetMapping("/")
	public RedirectView index() {
		return new RedirectView("/hello");
	}

	@GetMapping("/hello")
	public String hello() {
		return "app/hello";
	}
	@GetMapping("/bds")
	public String bds() {
		return "app/bds";
	}
}
