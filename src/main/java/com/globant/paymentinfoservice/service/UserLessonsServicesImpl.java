package com.globant.paymentinfoservice.service;

import com.globant.paymentinfoservice.model.UserLessons;
import com.globant.paymentinfoservice.repository.UserLessonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLessonsServicesImpl implements UserLessonsService {

  private final UserLessonsRepository userLessonsRepository;

  @Autowired
  public UserLessonsServicesImpl(UserLessonsRepository userLessonsRepository) {
    this.userLessonsRepository = userLessonsRepository;
  }

  @Override
  public UserLessons findByUserId(int userId) {
    return userLessonsRepository.findByUserId(userId);
  }

  @Override
  public UserLessons save(UserLessons userLessons) {
    return userLessonsRepository.save(userLessons);
  }
}
