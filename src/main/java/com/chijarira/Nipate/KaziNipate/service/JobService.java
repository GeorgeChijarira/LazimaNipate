package com.chijarira.Nipate.KaziNipate.service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chijarira.Nipate.KaziNipate.model.Job;
import com.chijarira.Nipate.KaziNipate.repository.JobRepository;

@Service
public class JobService implements JobServiceInterface{

	
	@PersistenceContext
	private EntityManager em;
	

	@Autowired
	private JobRepository repository;

	@Override
	public List<Job> findAll() {
		
		return (List<Job>) repository.findAll();
	
	}
	}