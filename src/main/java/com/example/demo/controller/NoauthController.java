
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noauth/rest/")
public class NoauthController {
	
	@GetMapping("getMsg")
	public String msg() {
		return "Welcome";
	}

}
