package com.example.baloisedesignsystemwebjarapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class DemoController {

	@GetMapping("/")
	public RedirectView index() {
		return new RedirectView("/bds");
	}

	@GetMapping("/bds")
	public String bds() {
		return "app/bds";
	}
}
