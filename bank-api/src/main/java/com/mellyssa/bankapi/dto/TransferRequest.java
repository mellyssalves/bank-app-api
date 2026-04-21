package com.mellyssa.bankapi.dto;

public class TransferRequest {

    private Long fromUserId;
    private Long toUserId;
    private Double amount;

    public Long getFromUserId() { return fromUserId; }
    public Long getToUserId() { return toUserId; }
    public Double getAmount() { return amount; }

    public void setFromUserId(Long fromUserId) { this.fromUserId = fromUserId; }
    public void setToUserId(Long toUserId) { this.toUserId = toUserId; }
    public void setAmount(Double amount) { this.amount = amount; }
}