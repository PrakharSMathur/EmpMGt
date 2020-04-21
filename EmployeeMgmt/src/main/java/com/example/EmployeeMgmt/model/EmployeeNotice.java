package com.example.EmployeeMgmt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeNotice")
public class EmployeeNotice {

  @Id
  String empNoticeId;
  String from;
  String message;

  //Constructor
  public EmployeeNotice(String from, String message) {
    super();
    this.from = from;
    this.message = message;
  }

  public EmployeeNotice() {
  }

  //Getters and Setters
  public String getEmpNoticeId() {
    return empNoticeId;
  }

  public void setEmpNoticeId(String empNoticeId) {
    this.empNoticeId = empNoticeId;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  //toString

  @Override
  public String toString() {
    return "EmployeeNotice{" +
        "id='" + empNoticeId + '\'' +
        ", from='" + from + '\'' +
        ", message='" + message + '\'' +
        '}';
  }
}