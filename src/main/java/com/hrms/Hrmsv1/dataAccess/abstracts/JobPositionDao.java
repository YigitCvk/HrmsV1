package com.hrms.Hrmsv1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.Hrmsv1.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
