package com.example.EmployeeMgmt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HRNotice")
public class HRNotice {
  @Id
  String noticeID; //(Auto-generated)
  String from;
  String message;

  public HRNotice(String noticeID, String from, String message) {
    this.noticeID = noticeID;
    this.from = from;
    this.message = message;
  }

  public String getNoticeID() {
    return noticeID;
  }

  public void setNoticeID(String noticeID) {
    this.noticeID = noticeID;
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
}
