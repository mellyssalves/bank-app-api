package com.mellyssa.bankapi.repository;

import com.mellyssa.bankapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}