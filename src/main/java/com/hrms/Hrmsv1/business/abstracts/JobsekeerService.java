package com.hrms.Hrmsv1.business.abstracts;

import java.util.List;

import com.hrms.Hrmsv1.entities.concretes.Jobseeker;


public interface JobsekeerService {
	
	void add(Jobseeker jobseeker);
	void update(Jobseeker jobseeker);
	void delete(int id);
	Jobseeker getById(int id);
	List<Jobseeker> getAll();

}
