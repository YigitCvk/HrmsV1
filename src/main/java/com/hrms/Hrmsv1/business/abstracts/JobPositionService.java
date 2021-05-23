package com.hrms.Hrmsv1.business.abstracts;

import java.util.List;

import com.hrms.Hrmsv1.core.utilities.results.DataResult;
import com.hrms.Hrmsv1.entities.concretes.JobPosition;

public interface JobPositionService {

	
	/*void add(JobPosition jobPosition);
	void update(JobPosition jobPosition);
	void delete(int id);
	JobPosition getById(int id);*/
	
	
	DataResult<List<JobPosition>> getAll();
}
