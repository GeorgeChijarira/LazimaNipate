package com.chijarira.Nipate.KaziNipate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class WebController {
	@GetMapping(value="/")
    public String homepage(){
        return "index";
    }
	
	@GetMapping(value="/employerLogin")
    public String employerLogin(){
        return "employerLogin";
    }
	
	@GetMapping(value="/employerDashboard")
    public String employerDashboard(){
        return "employerDashboard";
    }
	
}
