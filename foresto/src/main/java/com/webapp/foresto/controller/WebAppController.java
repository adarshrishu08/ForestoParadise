package com.webapp.foresto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebAppController {

	@RequestMapping(value="/")
	@ResponseBody
	public String index(ModelMap Map){
		return "Hello World";
	}
	
	@RequestMapping(value="/home")
	public String getHome(ModelMap Map){
		return "index";
	}
}
