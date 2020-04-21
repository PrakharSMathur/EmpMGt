package com.example.EmployeeMgmt.service;

import com.example.EmployeeMgmt.model.Employee;
import com.example.EmployeeMgmt.model.EmployeeLeaves;
import com.example.EmployeeMgmt.model.HR;
import com.example.EmployeeMgmt.repository.EmployeeLeavesRepository;
import com.example.EmployeeMgmt.repository.EmployeeNoticeRepository;
import com.example.EmployeeMgmt.repository.EmployeeRepository;
import com.example.EmployeeMgmt.repository.HRNoticeRepository;
import com.example.EmployeeMgmt.repository.HRRepository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
  @Autowired
  EmployeeRepository employeeRepository;
  @Autowired
  EmployeeLeavesRepository employeeLeavesRepository;
  @Autowired
  EmployeeNoticeRepository employeeNoticeRepository;
  @Autowired
  HRRepository hrRepository;
  @Autowired
  HRNoticeRepository hrNoticeRepository;

  public Serializable addEmployeeService(Employee employee) {
    //Adding Employee details supplied with Auto-Generated ID
    employee.setEmpId(SequenceGeneratorService.generateEmpIDSequence("employee_sequences"));
    employeeRepository.insert(employee);

    //Adding default leaves
    EmployeeLeaves newEmpLeave = new EmployeeLeaves();
    newEmpLeave.setId(SequenceGeneratorService.generateEmpLeaveSequence("employee_leave_sequences"));
    newEmpLeave.setEmpid(employee.getEmpId());
    newEmpLeave.setLeaves_left(20);
    newEmpLeave.setLeaves_approved(0);
    newEmpLeave.setLeaves_applied(0);
    employeeLeavesRepository.insert(newEmpLeave);
    return String.format("Employee Inserted and Leave Doc set - %s", employee.getEmpId());

}


  public String deleteEmployeeService(String empId) {
    if (employeeRepository.existsById(empId)) {
      employeeRepository.deleteById(empId);
      employeeLeavesRepository.deleteById(empId);
      employeeNoticeRepository.deleteAllById(empId);
      return "Employee deleted : " + empId;
    } else {
      return "Entry does not exist";
    }
  }

  public Serializable addHRService(HR hr){
      hr.setHrId(SequenceGeneratorService.generateHrIDSequence("hr_sequences"));
      hrRepository.insert(hr);
      return "Added HR -"+ hr.getHrId();
      }

  public String deleteHRService(String hrId) {
    if (hrRepository.existsById(hrId)) {
      hrRepository.deleteById(hrId);
      return "HR deleted : " + hrId;
    } else {
      return "Entry does not exist";
    }
  }

  public List<HR> viewAllHRs() {
    return hrRepository.findAll();
  }

  public Optional<HR> getHR(String hrId) {
    Optional<HR> h = hrRepository.findById(hrId);
    return h;
  }


  public String updateEmployeeService(Employee employee, String empId) {
    if (!employeeRepository.findById(empId).isPresent()) {
      return "ID does not exist";
    } else {
      employee.setEmpId(empId);
      employeeRepository.save(employee);
      return "Updated :" + employee;
    }
  }
}


