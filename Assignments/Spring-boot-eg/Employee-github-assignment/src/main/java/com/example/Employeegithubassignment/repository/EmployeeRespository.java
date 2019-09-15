package com.example.Employeegithubassignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Employeegithubassignmrnt.bean.Employee;

public interface EmployeeRespository extends CrudRepository<Employee, Long> {
	
	public Employee creates(Employee emp);
	public void deletes(long id);

}
