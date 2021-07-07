package com.felipepestana.projeto1.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {
	
	
	
	@GetMapping("hello")
	public ModelAndView hello() {
		
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("nome", "Felipe2");
	
		return mv;
	}
	
	@GetMapping("hello-model")
	public String hello(Model model) {
		model.addAttribute("nome","Felipe1");
		
		return "hello";
	}

}
