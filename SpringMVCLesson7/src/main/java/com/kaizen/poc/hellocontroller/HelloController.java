package com.kaizen.poc.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/welcome")
	public ModelAndView helloWorld(){
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello World");
		
		return model;
	}

}
