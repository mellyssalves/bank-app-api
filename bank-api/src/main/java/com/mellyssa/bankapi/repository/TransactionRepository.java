package com.mellyssa.bankapi.repository;

import com.mellyssa.bankapi.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}