package com.isoft.po;


public class Product {

  private String id;
  private String productName;
  private double productNum;
  private String productUnit;
  private double productPrice;
  private java.sql.Timestamp productEnterDay;
  private long productState;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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


  public java.sql.Timestamp getProductEnterDay() {
    return productEnterDay;
  }

  public void setProductEnterDay(java.sql.Timestamp productEnterDay) {
    this.productEnterDay = productEnterDay;
  }


  public long getProductState() {
    return productState;
  }

  public void setProductState(long productState) {
    this.productState = productState;
  }

  @Override
  public String toString() {
    return "Product{" +
            "id='" + id + '\'' +
            ", productName='" + productName + '\'' +
            ", productNum=" + productNum +
            ", productUnit='" + productUnit + '\'' +
            ", productPrice=" + productPrice +
            ", productEnterDay=" + productEnterDay +
            ", productState=" + productState +
            '}';
  }
}
