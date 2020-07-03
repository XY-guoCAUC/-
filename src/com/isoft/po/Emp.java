package com.isoft.po;


public class Emp {

  private String id;
  private String empName;
  private String empLoginName;
  private String empLoginPassword;
  private long empType;
  private long empState;
  private java.sql.Timestamp empEnterDay;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public String getEmpLoginName() {
    return empLoginName;
  }

  public void setEmpLoginName(String empLoginName) {
    this.empLoginName = empLoginName;
  }


  public String getEmpLoginPassword() {
    return empLoginPassword;
  }

  public void setEmpLoginPassword(String empLoginPassword) {
    this.empLoginPassword = empLoginPassword;
  }


  public long getEmpType() {
    return empType;
  }

  public void setEmpType(long empType) {
    this.empType = empType;
  }


  public long getEmpState() {
    return empState;
  }

  public void setEmpState(long empState) {
    this.empState = empState;
  }


  public java.sql.Timestamp getEmpEnterDay() {
    return empEnterDay;
  }

  public void setEmpEnterDay(java.sql.Timestamp empEnterDay) {
    this.empEnterDay = empEnterDay;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "id='" + id + '\'' +
            ", empName='" + empName + '\'' +
            ", empLoginName='" + empLoginName + '\'' +
            ", empLoginPassword='" + empLoginPassword + '\'' +
            ", empType=" + empType +
            ", empState=" + empState +
            ", empEnterDay=" + empEnterDay +
            '}';
  }
}
