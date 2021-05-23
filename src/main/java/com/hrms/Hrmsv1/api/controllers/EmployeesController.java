package com.hrms.Hrmsv1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.Hrmsv1.business.abstracts.EmployeeService;
import com.hrms.Hrmsv1.core.utilities.results.DataResult;
import com.hrms.Hrmsv1.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeeService;
	

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
//	@PostMapping("/add")
//	public void add(@RequestBody Employee employee){
//		this.employeeService.add(employee);
//	}
//	
//	@PostMapping("/update")
//	public void update(@RequestBody Employee employee){
//		this.employeeService.update(employee);
//	}
//	
//	@PostMapping("/delete")
//	public void delete(@PathVariable("id") int id){
//		this.employeeService.delete(id);
//	}
//	
//	@GetMapping("/getbyid")
//	public Employee getById(@PathVariable("id") int id){
//		return this.employeeService.getById(id);
//	}
//	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
}
