/**
 * 
 */
package com.naren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author narender
 *
 */
@Controller
public class HelloWorldController {
	
	public HelloWorldController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!");
		return "helloWorld";
	}
}
