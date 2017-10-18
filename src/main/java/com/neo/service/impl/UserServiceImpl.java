package com.neo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.entity.User;
import com.neo.repository.UserRepository;
import com.neo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//注入查询条件
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findUserById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void edit(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
	}

	
	
	
}
