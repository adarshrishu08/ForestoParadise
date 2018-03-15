package com.webapp.foresto.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class ForestoAdminController {

	@RequestMapping(value="/home")
	public String adminHome(Model model){
		return "admin/index";
	}
}
