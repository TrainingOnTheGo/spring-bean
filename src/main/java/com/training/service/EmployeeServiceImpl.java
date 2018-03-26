package com.training.service;

import java.util.List;

import com.training.repository.EmployeeRepository;
import com.training.repository.EmployeeRepositoryImpl;
import com.traning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
	
	@Override
	public List<Employee> findAll() {		
		return employeeRepository.findAll();
	}
}
