package sba4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/enter")
	public String get() {
		return "Hello-world";
	}

}
