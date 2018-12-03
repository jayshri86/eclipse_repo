package com.example.SpringDemoInMemory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemoInMemory.beans.Employee;
import com.example.SpringDemoInMemory.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/employee", method=RequestMethod.POST, headers = "accept=application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		System.out.println("In Controller");
		Employee addEmployee = employeeService.addEmployee(employee);
		
		return addEmployee;
	}
	
	@RequestMapping(value="/listEmployee", method=RequestMethod.GET, headers = "accept=application/json")
	public Iterable<Employee> getEmployee() {
		
		return employeeService.getAllEmployees();
		
	}
	
	@RequestMapping(value="/listEmployeeByName/{name}", method=RequestMethod.GET, headers = "accept=application/json")
	public Iterable<Employee> getEmployeeByName(@PathVariable String name) {
		
		System.out.println("name ===> " + name);
		return employeeService.getEmployeeByName(name);
		
	}

}
