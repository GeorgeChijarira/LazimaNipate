package com.chijarira.Nipate.KaziNipate.model;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Job implements Serializable{



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String jobTitle;
	private String company;
	private String jobLocation;
	private String jobDescription;
	private double salary;

public Job() {};
	
	public Job(String jobTitle, String company, String jobLocation, String jobDescription, double salary) {
		super();
		this.jobTitle = jobTitle;
		this.company = company;
		this.jobLocation = jobLocation;
		this.jobDescription = jobDescription;
		this.salary = salary;
		
		
	}
	
	public String toString()
	{
		return "Job " + this.jobTitle + " " + this.jobLocation + " " + this.company + 
				". Description: " + this.jobDescription + " " + "Salary: $" + this.salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	
}
	
	
	
