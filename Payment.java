package com.pankaj.cabbooking.entity;

import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String status;

    @OneToOne
    private Ride ride;

    public Payment(){}

    public Long getId(){return id;}

    public Double getAmount(){return amount;}
    public void setAmount(Double amount){this.amount=amount;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public Ride getRide(){return ride;}
    public void setRide(Ride ride){this.ride=ride;}
}