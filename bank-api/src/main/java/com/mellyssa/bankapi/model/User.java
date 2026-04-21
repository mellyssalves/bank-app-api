package com.mellyssa.bankapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double balance;

    public Long getId() { return id; }
    public String getName() { return name; }
    public Double getBalance() { return balance; }

    public void setName(String name) { this.name = name; }
    public void setBalance(Double balance) { this.balance = balance; }
}

