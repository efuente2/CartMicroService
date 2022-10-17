package com.mtit.microservice.paymentservice.paymentservice.repository;

import com.mtit.microservice.paymentservice.paymentservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositroy extends JpaRepository<Payment, Long> {

}
