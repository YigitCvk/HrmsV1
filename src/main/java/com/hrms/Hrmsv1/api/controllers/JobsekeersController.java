package com.hrms.Hrmsv1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.Hrmsv1.business.abstracts.JobsekeerService;
import com.hrms.Hrmsv1.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobsekeer")

public class JobsekeersController {
	
	private JobsekeerService jobsekeerService;

	@Autowired
	public JobsekeersController(JobsekeerService jobsekeerService) {
		super();
		this.jobsekeerService = jobsekeerService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Jobseeker jobseeker) {
		this.jobsekeerService.add(jobseeker);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Jobseeker jobseeker) {
		this.jobsekeerService.update(jobseeker);
	}
	@PostMapping("/delete")
	public void delete(@PathVariable("i") int id) {
		this.jobsekeerService.delete(id);
	}
	@GetMapping("getbyid")
	public Jobseeker getById(@PathVariable("id") int id) {
		return this.jobsekeerService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Jobseeker> getAll(){
		return this.jobsekeerService.getAll();
	}

}
