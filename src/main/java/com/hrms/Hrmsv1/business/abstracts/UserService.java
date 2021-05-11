package com.hrms.Hrmsv1.business.abstracts;

import java.util.List;

import com.hrms.Hrmsv1.entities.concretes.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(int id);
	User getById(int id);
	List<User> getAll();
}
