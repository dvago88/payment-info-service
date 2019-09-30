package com.globant.paymentinfoservice.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentInformation {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int paymentId;
  private double amountPaid;
  private Date paymentDate;
  private int numberOfLessons;
  private int userId;

  public PaymentInformation() {
    super();
  }

  public int getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(int paymentId) {
    this.paymentId = paymentId;
  }

  public double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public int getNumberOfLessons() {
    return numberOfLessons;
  }

  public void setNumberOfLessons(int numberOfLessons) {
    this.numberOfLessons = numberOfLessons;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
