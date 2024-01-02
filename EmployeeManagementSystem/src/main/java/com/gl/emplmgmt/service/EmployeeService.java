package com.gl.emplmgmt.service;


import java.util.List;

import com.gl.emplmgmt.entity.Employee;

	public interface EmployeeService {

	    List<Employee> getAllEmployees();

	    Employee getEmployeeById(Long id);

	    void saveEmployee(Employee employee);

	    void updateEmployee(Employee employee);

	    void deleteEmployee(Long id);

		void deleteById(int id);

		Employee findById(int empId);
	}


