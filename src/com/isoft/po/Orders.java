package com.isoft.po;


public class Orders {

  private String id;
  private String orderid;
  private String memberId;
  private String memberSn;
  private String productId;
  private String productName;
  private double productNum;
  private String productUnit;
  private double productPrice;
  private java.sql.Timestamp ordersDay;
  private long orderstate;
  private long orderisover;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getOrderid() {
    return orderid;
  }

  public void setOrderid(String orderid) {
    this.orderid = orderid;
  }


  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public String getMemberSn() {
    return memberSn;
  }

  public void setMemberSn(String memberSn) {
    this.memberSn = memberSn;
  }


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public double getProductNum() {
    return productNum;
  }

  public void setProductNum(double productNum) {
    this.productNum = productNum;
  }


  public String getProductUnit() {
    return productUnit;
  }

  public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public java.sql.Timestamp getOrdersDay() {
    return ordersDay;
  }

  public void setOrdersDay(java.sql.Timestamp ordersDay) {
    this.ordersDay = ordersDay;
  }


  public long getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(long orderstate) {
    this.orderstate = orderstate;
  }


  public long getOrderisover() {
    return orderisover;
  }

  public void setOrderisover(long orderisover) {
    this.orderisover = orderisover;
  }

  @Override
  public String toString() {
    return "Orders{" +
            "id='" + id + '\'' +
            ", orderid='" + orderid + '\'' +
            ", memberId='" + memberId + '\'' +
            ", memberSn='" + memberSn + '\'' +
            ", productId='" + productId + '\'' +
            ", productName='" + productName + '\'' +
            ", productNum=" + productNum +
            ", productUnit='" + productUnit + '\'' +
            ", productPrice=" + productPrice +
            ", ordersDay=" + ordersDay +
            ", orderstate=" + orderstate +
            ", orderisover=" + orderisover +
            '}';
  }
}
