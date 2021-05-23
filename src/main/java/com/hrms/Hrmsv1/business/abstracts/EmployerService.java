package com.hrms.Hrmsv1.business.abstracts;

import java.util.List;

import com.hrms.Hrmsv1.core.utilities.results.DataResult;
import com.hrms.Hrmsv1.entities.concretes.Employer;

public interface EmployerService {

/*	void add(Employer employer);
	void update(Employer employer);
	void delete(int id);
	Employer getById(int id);*/
	
	DataResult<List<Employer>> getAll();
	
}
