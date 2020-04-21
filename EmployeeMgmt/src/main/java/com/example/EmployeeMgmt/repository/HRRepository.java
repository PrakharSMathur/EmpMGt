package com.example.EmployeeMgmt.repository;

import com.example.EmployeeMgmt.model.HR;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HRRepository extends MongoRepository<HR,String> {

}
