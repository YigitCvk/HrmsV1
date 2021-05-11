package com.hrms.Hrmsv1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.Hrmsv1.business.abstracts.EmployerService;
import com.hrms.Hrmsv1.dataAccess.abstracts.EmployerDao;
import com.hrms.Hrmsv1.entities.concretes.Employer;

@Service
public class EmployerManger  implements EmployerService{

	EmployerDao employerDao;
	
	@Autowired
	public EmployerManger(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public void add(Employer employer) {
		this.employerDao.save(employer);
		
	}

	@Override
	public void update(Employer employer) {
		this.employerDao.save(employer);
	}

	@Override
	public void delete(int id) {
		this.employerDao.deleteById(id);
		
	}

	@Override
	public Employer getById(int id) {
		return this.employerDao.getOne(id);
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

}