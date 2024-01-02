package com.gl.emplmgmt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.emplmgmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

