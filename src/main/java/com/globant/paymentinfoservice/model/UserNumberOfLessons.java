package com.globant.paymentinfoservice.model;

public class UserNumberOfLessons {

    private int userId;
    private int numberOfRemainingLessons;

    public UserNumberOfLessons() {
        super();
    }

    public UserNumberOfLessons(int userId, int numberOfRemainingLessons) {
        this.userId = userId;
        this.numberOfRemainingLessons = numberOfRemainingLessons;
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
