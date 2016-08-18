package com.kaizen.poc.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest requset,
			HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hi User, Welcome to the first Spring MVC Application");
		
		return model;
	}

}
