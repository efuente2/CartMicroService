package com.mtit.microservice.paymentservice.paymentservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponce {
    private int id;
    private String name;
    private String description;
    private String price;


}