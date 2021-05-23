package com.hrms.Hrmsv1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.Hrmsv1.business.abstracts.JobsekeerService;
import com.hrms.Hrmsv1.core.utilities.results.DataResult;
import com.hrms.Hrmsv1.core.utilities.results.SuccessDataResult;
import com.hrms.Hrmsv1.dataAccess.abstracts.JobseekerDao;
import com.hrms.Hrmsv1.entities.concretes.Jobseeker;

@Service
public class JobsekeerManager  implements JobsekeerService{

	JobseekerDao jobseekerDao;
	@Autowired
	public JobsekeerManager(JobseekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}
//
//	@Override
//	public void add(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//		
//	}
//
//	@Override
//	public void update(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//		
//	}
//
//	@Override
//	public void delete(int id) {
//		this.jobseekerDao.deleteById(id);
//		
//	}
//
//	@Override
//	public Jobseeker getById(int id) {
//		return this.jobseekerDao.getOne(id);
//	}
//
//	@Override
//	public List<Jobseeker> getAll() {
//		return this.jobseekerDao.findAll();
//	}
	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}
	
	
	
}
