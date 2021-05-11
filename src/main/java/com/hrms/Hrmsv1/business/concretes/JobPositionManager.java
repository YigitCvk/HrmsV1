package com.hrms.Hrmsv1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.Hrmsv1.business.abstracts.JobPositionService;
import com.hrms.Hrmsv1.dataAccess.abstracts.JobPositionDao;
import com.hrms.Hrmsv1.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService {

	JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public void add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
	}

	@Override
	public void update(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		
	}

	@Override
	public void delete(int id) {

		this.jobPositionDao.deleteById(id);
	}

	@Override
	public JobPosition getById(int id) {
		return this.jobPositionDao.getOne(id);
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
