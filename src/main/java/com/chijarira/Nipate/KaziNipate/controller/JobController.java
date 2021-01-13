package com.chijarira.Nipate.KaziNipate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chijarira.Nipate.KaziNipate.model.Job;
import com.chijarira.Nipate.KaziNipate.service.JobServiceInterface;

@Controller
public class JobController {

	@Autowired
	private JobServiceInterface jobService;
	
	
	@GetMapping("/allJobs")
	public String getAllJobs(Model model)
	{
		 Job j1 = new Job("jobTitle", " company", "jobLocation", "jobDescription", 23.5);
		 jobService.insert(j1);
		var jobs = jobService.findAll();
		model.addAttribute("jobs", jobs);
		
		return "showJobs";	}
	
}
