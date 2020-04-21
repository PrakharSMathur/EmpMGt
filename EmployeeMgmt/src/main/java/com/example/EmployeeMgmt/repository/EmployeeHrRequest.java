package com.example.EmployeeMgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHrRequest extends MongoRepository<EmployeeHrRequest,String> {

}
