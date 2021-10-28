package com.fabio.controlbudget.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class BudgetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;

    private CustomerEntity customer;

    private String payment;
    private LocalDate forecastDelivery;

    private ProductEntity product;



}
