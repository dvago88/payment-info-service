package com.globant.paymentinfoservice.service;

import com.globant.paymentinfoservice.model.UserLessons;

public interface UserLessonsService {

  UserLessons findByUserId(int userId);

  UserLessons save(UserLessons userLessons);
}
