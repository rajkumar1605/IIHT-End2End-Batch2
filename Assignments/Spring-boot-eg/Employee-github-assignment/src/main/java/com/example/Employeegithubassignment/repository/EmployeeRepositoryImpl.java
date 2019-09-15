package com.example.Employeegithubassignment.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Employeegithubassignmrnt.bean.Employee;


public abstract class EmployeeRepositoryImpl implements EmployeeRespository {
	
	@Autowired 
	EmployeeRepositoryImpl reposit;

	public Employee creates(Employee emp) {
		Employee emps=(Employee) reposit.save(emp);
		
		return emps;
	}

	public void deletes(long id) {
		reposit.deleteById(id);	
	}

//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void delete(Employee arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends Employee> arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteById(Long arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public boolean existsById(Long arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterable<Employee> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Iterable<Employee> findAllById(Iterable<Long> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Optional<Employee> findById(Long arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Employee> S save(S arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Employee> Iterable<S> saveAll(Iterable<S> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
