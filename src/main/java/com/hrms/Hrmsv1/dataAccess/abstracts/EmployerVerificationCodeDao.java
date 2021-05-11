package com.hrms.Hrmsv1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.Hrmsv1.entities.concretes.EmployerVerificationCode;

public interface EmployerVerificationCodeDao extends JpaRepository<EmployerVerificationCode, Integer> {

}
