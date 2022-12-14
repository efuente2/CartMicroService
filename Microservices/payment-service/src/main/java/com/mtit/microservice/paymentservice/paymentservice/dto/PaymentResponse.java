package com.mtit.microservice.paymentservice.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private int id;
    private String amount;
    private String date;
    private String itemId;
}
