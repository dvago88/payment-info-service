package com.globant.paymentinfoservice.repository;

import com.globant.paymentinfoservice.model.UserLessons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLessonsRepository extends CrudRepository<UserLessons, Integer> {
  UserLessons findByUserId(int userId);
}
