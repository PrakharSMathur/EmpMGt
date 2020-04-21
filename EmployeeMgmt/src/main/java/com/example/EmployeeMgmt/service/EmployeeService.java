package com.example.EmployeeMgmt.service;

import com.example.EmployeeMgmt.model.EmployeeNotice;
import com.example.EmployeeMgmt.repository.EmployeeNoticeRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  public EmployeeNoticeRepository enr;

  public ArrayList<EmployeeNotice> viewEmpMsg(String empId) {
    // TODO Auto-generated method stub
    return enr.getEmpMsgById(empId);
  }

}
