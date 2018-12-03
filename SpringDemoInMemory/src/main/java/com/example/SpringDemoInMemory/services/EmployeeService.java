package com.example.SpringDemoInMemory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDemoInMemory.beans.Employee;
import com.example.SpringDemoInMemory.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {		
		return employeeRepository.save(employee);		
	}
	
	public Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();			
	}
	
	
	public Iterable<Employee> getEmployeeByName(String name){
		return employeeRepository.findByName(name);		
	}

	
	
}
