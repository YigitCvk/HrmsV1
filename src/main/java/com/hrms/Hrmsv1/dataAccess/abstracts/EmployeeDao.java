package com.hrms.Hrmsv1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.Hrmsv1.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
