package com.example.EmployeeMgmt.repository;

import com.example.EmployeeMgmt.model.EmployeeLeaveRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeLeaveRequestRepository extends MongoRepository<EmployeeLeaveRequest,String> {

}
