package com.example.EmployeeMgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHrRequest extends PagingAndSortingRepository<EmployeeHrRequest,String> {

}
