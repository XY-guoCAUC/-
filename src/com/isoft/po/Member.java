package com.isoft.po;


public class Member {

  private String id;
  private String memberSn;
  private String memberName;
  private double memberPoint;
  private String memberPhone;
  private long memberState;
  private java.sql.Timestamp memberEnterDay;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getMemberSn() {
    return memberSn;
  }

  public void setMemberSn(String memberSn) {
    this.memberSn = memberSn;
  }


  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }


  public double getMemberPoint() {
    return memberPoint;
  }

  public void setMemberPoint(double memberPoint) {
    this.memberPoint = memberPoint;
  }


  public String getMemberPhone() {
    return memberPhone;
  }

  public void setMemberPhone(String memberPhone) {
    this.memberPhone = memberPhone;
  }


  public long getMemberState() {
    return memberState;
  }

  public void setMemberState(long memberState) {
    this.memberState = memberState;
  }


  public java.sql.Timestamp getMemberEnterDay() {
    return memberEnterDay;
  }

  public void setMemberEnterDay(java.sql.Timestamp memberEnterDay) {
    this.memberEnterDay = memberEnterDay;
  }

  @Override
  public String toString() {
    return "Member{" +
            "id='" + id + '\'' +
            ", memberSn='" + memberSn + '\'' +
            ", memberName='" + memberName + '\'' +
            ", memberPoint=" + memberPoint +
            ", memberPhone='" + memberPhone + '\'' +
            ", memberState=" + memberState +
            ", memberEnterDay=" + memberEnterDay +
            '}';
  }
}
