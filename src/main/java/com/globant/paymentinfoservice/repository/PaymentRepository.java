package com.globant.paymentinfoservice.repository;

import com.globant.paymentinfoservice.model.PaymentInformation;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<PaymentInformation, Integer> {

}
