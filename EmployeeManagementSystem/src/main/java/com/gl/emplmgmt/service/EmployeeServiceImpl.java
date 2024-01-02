package com.gl.emplmgmt.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.emplmgmt.entity.Employee;
import com.gl.emplmgmt.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int empId) {
    	Optional<Employee> result= employeeRepository.findById(empId);
    	Employee theEmployee = null;
    	if(result.isPresent())
    	{
    		theEmployee= result.get();
    	}
    	else {
    		throw new RuntimeException("Did not find the Employee id:" + empId);
    		
    	}
    		return theEmployee;
    }


    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

  @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

@Override
public Employee getEmployeeById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void updateEmployee(Employee employee) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteEmployee(Long id) {
	// TODO Auto-generated method stub
	
}


}
