package com.example.SpringDemoInMemory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDemoInMemory.beans.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Iterable<Employee>  findByName(String name);

}
