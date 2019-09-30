package com.globant.paymentinfoservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserLessons {

  @Id
  private int id;
  private int userId;
  private int numberOfRemainingLessons;

  public UserLessons() {
    super();
  }

  public UserLessons(int userId, int numberOfRemainingLessons) {
    this.userId = userId;
    this.numberOfRemainingLessons = numberOfRemainingLessons;
  }

  public int addLessons(int numberOfLessons) {
    return numberOfRemainingLessons += numberOfLessons;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public synchronized int getNumberOfRemainingLessons() {
    return numberOfRemainingLessons;
  }

  public synchronized void setNumberOfRemainingLessons(int numberOfRemainingLessons) {
    this.numberOfRemainingLessons = numberOfRemainingLessons;
  }
}
