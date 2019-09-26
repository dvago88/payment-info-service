package com.globant.paymentinfoservice.resource;

import com.globant.paymentinfoservice.model.PaymentInformation;
import com.globant.paymentinfoservice.model.UserLessons;
import com.globant.paymentinfoservice.repository.UserLessonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentInformationResource {

  private final UserLessonsRepository userLessonsRepository;

  @Autowired
  public PaymentInformationResource(UserLessonsRepository userLessonsRepository) {
    this.userLessonsRepository = userLessonsRepository;
  }

  @PostMapping("/pay")
  public UserLessons createPayment(PaymentInformation paymentInformation) {
    //Process payment

    //Call service to update number of total classes.

    //Not sure what to return yet.
    return new UserLessons();
  }

  @GetMapping("/{userId}")
  public UserLessons getNumberOfLessons(@PathVariable("userId") int userId) {
    return userLessonsRepository.findByUserId(userId);
  }
}
