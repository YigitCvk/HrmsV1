package com.hrms.Hrmsv1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.Hrmsv1.business.abstracts.UserService;
import com.hrms.Hrmsv1.core.utilities.results.DataResult;
import com.hrms.Hrmsv1.core.utilities.results.SuccessDataResult;
import com.hrms.Hrmsv1.dataAccess.abstracts.UserDao;
import com.hrms.Hrmsv1.entities.concretes.User;


@Service
public class UserManager implements UserService {

	UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

//	@Override
//	public void add(User user) {
//		this.userDao.save(user);
//		
//	}
//
//	@Override
//	public void update(User user) {
//		this.userDao.save(user);
//		
//	}
//
//	@Override
//	public void delete(int id) {
//		this.userDao.deleteById(id);
//		
//	}
//
//	@Override
//	public User getById(int id) {
//		return this.userDao.getOne(id);
//	}
//
//	@Override
//	public List<User> getAll() {
//		return this.userDao.findAll();
//	}

}
