package com.globant.paymentinfoservice.model;

import java.util.Date;

public class PaymentInformation {

  private double amountPaid;
  private Date paymentDate;
  private int numberOfClasses;
  private int userId;

  public PaymentInformation() {
    super();
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

  public int getNumberOfClasses() {
    return numberOfClasses;
  }

  public void setNumberOfClasses(int numberOfClasses) {
    this.numberOfClasses = numberOfClasses;
  }
}
