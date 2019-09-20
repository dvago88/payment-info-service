package com.globant.paymentinfoservice.resource;

import com.globant.paymentinfoservice.model.PaymentInformation;
import com.globant.paymentinfoservice.model.UserNumberOfLessons;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentInformationResource {

    @PostMapping("/pay")
    public UserNumberOfLessons createPayment(PaymentInformation paymentInformation) {
        //Process payment

        //Call service to update number of total classes.

        //Not sure what to return yet.
        return new UserNumberOfLessons();
    }

    @GetMapping("/{userId}")
    public UserNumberOfLessons getNumberOfLessons(@PathVariable("userId") int userId) {
        return new UserNumberOfLessons(userId, 5);
    }
}
