package com.example.EmployeeMgmt.controller;

import com.example.EmployeeMgmt.model.Employee;
import com.example.EmployeeMgmt.model.HR;
import com.example.EmployeeMgmt.service.AdminService;
import com.example.EmployeeMgmt.service.EmployeeService;
import com.example.EmployeeMgmt.service.HRService;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Admin")
public class AdminController {
@Autowired
  AdminService admin;
@Autowired
  HRService hrService;
@Autowired
  EmployeeService employeeService;

  @GetMapping("/GetAllEmployees")
  public List<Employee> viewAllEmployees()
  {
    return hrService.viewAllEmployees();
  }

  @GetMapping("/GetEmployee/{empId}")
  public Optional<Employee> getEmployee(@PathVariable String empId){ return hrService.getEmployee(empId);  }

  @PostMapping("/AddEmployee")
  public Serializable addStudentService(@RequestBody Employee employee) {
    return admin.addEmployeeService(employee);
  }

  @PutMapping("/updateEmployee/{empId}")
  public String updateEmployee(@RequestBody Employee employee,@PathVariable String empId){
    return admin.updateEmployeeService(employee,empId);
  }

  @DeleteMapping("/DeleteEmployee")
  public String deleteEmployee(@PathVariable String empId) {
    return admin.deleteEmployeeService(empId);
  }

  @GetMapping("/GetAllHRs")
  public List<HR> viewAllHRs()
  {
    return admin.viewAllHRs();
  }

  @GetMapping("/GetHR/{hrId}")
  public Optional<HR> getHR(@PathVariable String hrId){
    return admin.getHR(hrId);
  }

  @PostMapping("/AddHR")
  public Serializable addHRService(@RequestBody HR hr) {
    return admin.addHRService(hr);
  }

  @DeleteMapping("/DeleteHR")
  public String deleteHR(@PathVariable String hrId) {
    return admin.deleteHRService(hrId);
  }






}
