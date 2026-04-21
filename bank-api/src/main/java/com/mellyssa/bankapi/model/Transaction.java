package com.mellyssa.bankapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fromUserId;
    private Long toUserId;
    private Double amount;

    private LocalDateTime createdAt;

    public Transaction() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public Long getFromUserId() { return fromUserId; }
    public Long getToUserId() { return toUserId; }
    public Double getAmount() { return amount; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setFromUserId(Long fromUserId) { this.fromUserId = fromUserId; }
    public void setToUserId(Long toUserId) { this.toUserId = toUserId; }
    public void setAmount(Double amount) { this.amount = amount; }
}