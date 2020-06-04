/**
 * 
 */
package com.aman.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author amanb
 *
 */
@Controller
public class WishController {
	
	@GetMapping("/wishMe")
	public String greeting(@RequestParam("name") String name,Model model) {
		String message="Hi "+name+" -->Welcome to the new home ";
		model.addAttribute("message",message);
		return "home";
	}

}
