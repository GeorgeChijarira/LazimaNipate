package com.chijarira.Nipate.KaziNipate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chijarira.Nipate.KaziNipate.model.Job;
import com.chijarira.Nipate.KaziNipate.repository.JobRepository;

@Service
public class JobService implements JobServiceInterface{

	

	@Autowired
	private JobRepository repository;

	@Override
	public List<Job> findAll() {
		
		return (List<Job>) repository.findAll();
	
	}
	@Override
	public void insert(Job j)
	{
		repository.save(j);
	}

	
	}