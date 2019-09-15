package com.example.Employee.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.Employee.bean.User;

public interface UserService {
	public void createUser(User user);
	public List<User> getUser();
	public User findById(int id);
	public void update(User user);
	public void deleteUserById(int id);
	public void updatePartially(User user, int id);
	public User highSalary(List<User> totalList);
	public void createMultiple(List<User> multiple);
}

