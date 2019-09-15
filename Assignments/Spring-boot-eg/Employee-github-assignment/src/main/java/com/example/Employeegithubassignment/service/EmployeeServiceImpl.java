
package com.example.Employeegithubassignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employeegithubassignment.repository.EmployeeRespository;
import com.example.Employeegithubassignmrnt.bean.Employee;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeRespository repo;
	
	public Employee createEmployee(Employee emp) {
		return repo.creates(emp);
	}
	public void deleteEmployee(long id) {
		repo.deletes(id);
	}
	
}
