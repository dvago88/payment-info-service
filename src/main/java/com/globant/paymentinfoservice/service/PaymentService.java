package com.globant.paymentinfoservice.service;

import com.globant.paymentinfoservice.model.PaymentInformation;

public interface PaymentService {

  PaymentInformation save(PaymentInformation paymentInformation);
}
