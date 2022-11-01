package com.springBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.entity.Employee;
import com.springBoot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/employee")
	public Employee insertStudents(@RequestBody Employee employee) {

		System.out.println(employee);
		return this.service.insertEmployee(employee);
	}

	@GetMapping("/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable int empId) {
		return this.service.getById(empId);
	}

	@GetMapping("/employee")
	public List<Employee> getEmployeeAll() {

		return this.service.getAllEmployee();
	}

}
