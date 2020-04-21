package com.example.EmployeeMgmt.service;

import com.example.EmployeeMgmt.model.Employee;
import com.example.EmployeeMgmt.model.HR;
import com.example.EmployeeMgmt.repository.EmployeeRepository;
import com.example.EmployeeMgmt.repository.HRRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRService {
  @Autowired
  EmployeeRepository employeeRepository;
  @Autowired
  HRRepository hrRepository;

  public List<Employee> viewAllEmployees() {
    return (List<Employee>) employeeRepository.findAll();
  }

  public Optional<Employee> getEmployee(String empId) {
    Optional<Employee> e = employeeRepository.findById(empId);
    return e;
  }


}
