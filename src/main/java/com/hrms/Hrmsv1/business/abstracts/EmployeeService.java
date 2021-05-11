package com.hrms.Hrmsv1.business.abstracts;

import java.util.List;

import com.hrms.Hrmsv1.entities.concretes.Employee;

public interface EmployeeService {

	void add(Employee employee);
	void update(Employee employee);
	void delete(int id);
	Employee getById(int id);
	List<Employee> getAll();
}
