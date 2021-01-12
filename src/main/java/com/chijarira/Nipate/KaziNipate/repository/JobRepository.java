package com.chijarira.Nipate.KaziNipate.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chijarira.Nipate.KaziNipate.model.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Long>{

}



	