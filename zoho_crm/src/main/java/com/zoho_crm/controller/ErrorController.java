package com.zoho_crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandling(ModelMap modelMap) {
		
		modelMap.addAttribute("errorMsg", "please enter the all details");
		
		return "error_page";
		
	}

}
