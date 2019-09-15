package com.example.Employeegithubassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employeegithubassignment.service.EmployeeService;
import com.example.Employeegithubassignmrnt.bean.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl serve;
	
	
	@PostMapping("/create")
	public Employee create(@RequestBody Employee employee){
		Employee obj=new Employee( employee.getId(),employee.getName(), employee.getAge(),employee.getSalary() );
		Employee empresult=serve.createEmployee(obj);
		
		System.out.println(empresult.getId());
		return empresult;
	}
	
	@GetMapping("/delete/{id}")
	public void deletes(@PathVariable("id") long id){
		
		serve.deleteEmployee(id);
	}

}
