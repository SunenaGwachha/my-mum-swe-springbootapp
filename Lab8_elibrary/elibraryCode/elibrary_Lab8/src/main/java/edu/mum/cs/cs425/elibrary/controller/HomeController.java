package edu.mum.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	
//@RequestMapping(value= {"/","/eregister","/egister/home"}, method= RequestMethod.GET)
	
	@GetMapping(value={"/","/eregister","/eregister/home"})
	public String DisplayHomePage() {
		return "home/index";
	}


}

