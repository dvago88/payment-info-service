package com.globant.paymentinfoservice.resource;

import com.globant.paymentinfoservice.model.PaymentInformation;
import com.globant.paymentinfoservice.model.UserLessons;
import com.globant.paymentinfoservice.service.PaymentService;
import com.globant.paymentinfoservice.service.UserLessonsService;
import com.globant.paymentinfoservice.service.UserLessonsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentInformationResource {

  private final UserLessonsService userLessonsService;

  private final PaymentService paymentService;

  @Autowired
  public PaymentInformationResource(UserLessonsServicesImpl userLessonsService, PaymentService paymentService) {
    this.userLessonsService = userLessonsService;
    this.paymentService = paymentService;
  }

  @PostMapping(value = "/",
      consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public UserLessons createPayment(@RequestBody PaymentInformation paymentInformation) {
    //Process payment, this should be done in a different service...
    paymentService.save(paymentInformation);

    //Call service to update number of total classes. If fails it should rollback the  payment transaction
    UserLessons userLessons = userLessonsService.findByUserId(paymentInformation.getUserId());
    if (userLessons == null) {
      userLessons = new UserLessons(paymentInformation.getUserId(), paymentInformation.getNumberOfLessons());
    }
    userLessons = userLessonsService.save(userLessons);

    return userLessons;
  }

  @GetMapping("/{userId}")
  public UserLessons getNumberOfLessons(@PathVariable("userId") int userId) {
    return userLessonsService.findByUserId(userId);
  }
}
