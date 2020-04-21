package com.example.EmployeeMgmt.repository;

import com.example.EmployeeMgmt.model.EmployeeLeaveRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeLeaveRequestRepository extends
    PagingAndSortingRepository<EmployeeLeaveRequest,String> {

}
