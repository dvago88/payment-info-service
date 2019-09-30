package com.globant.paymentinfoservice.service;

import com.globant.paymentinfoservice.model.PaymentInformation;
import com.globant.paymentinfoservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentInformationImpl implements PaymentService {

  private final PaymentRepository paymentRepository;

  @Autowired
  public PaymentInformationImpl(PaymentRepository paymentRepository) {
    this.paymentRepository = paymentRepository;
  }

  @Override
  public PaymentInformation save(PaymentInformation paymentInformation) {
    return paymentRepository.save(paymentInformation);
  }
}
