package com.hrms.Hrmsv1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.Hrmsv1.business.abstracts.EmployeeService;
import com.hrms.Hrmsv1.core.utilities.results.DataResult;
import com.hrms.Hrmsv1.core.utilities.results.SuccessDataResult;
import com.hrms.Hrmsv1.dataAccess.abstracts.EmployeeDao;
import com.hrms.Hrmsv1.entities.concretes.Employee;

import net.bytebuddy.asm.Advice.This;

@Service
public class EmployeeManager implements EmployeeService {
	EmployeeDao employeeDao;


	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}
	

//
//	@Override
//	public void add(Employee employee) {
//		this.employeeDao.save(employee);
//		
//	}
//
//	@Override
//	public void update(Employee employee) {
//		this.employeeDao.save(employee);
//		
//	}
//
//	@Override
//	public void delete(int id) {
//
//		this.employeeDao.deleteById(id);
//	}
//
//	@Override
//	public Employee getById(int id) {
//		return this.employeeDao.getOne(id);
//	}
//
//	@Override
//	public List<Employee> getAll() {
//		return this.employeeDao.findAll();
//	}

}
