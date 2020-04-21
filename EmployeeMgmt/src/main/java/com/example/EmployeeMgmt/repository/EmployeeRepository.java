package com.example.EmployeeMgmt.repository;

import com.example.EmployeeMgmt.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

}
