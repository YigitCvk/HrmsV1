package com.hrms.Hrmsv1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.Hrmsv1.business.abstracts.EmployerService;
import com.hrms.Hrmsv1.core.utilities.results.DataResult;
import com.hrms.Hrmsv1.entities.concretes.Employer;

import lombok.Data;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
//	@PostMapping("/add")
//	public void add(@RequestBody Employer employer) {
//		this.employerService.add(employer);
//	}
//	@PostMapping("/update")
//	public void update(@RequestBody Employer employer){
//		this.employerService.update(employer);
//	}
//	
//	@PostMapping("/delete")
//	public void delete(@PathVariable("id") int id){
//		this.employerService.delete(id);
//	}
//	
//	@GetMapping("/getbyid")
//	public Employer getById(@PathVariable("id") int id){
//		return this.employerService.getById(id);
//	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
}
