package com.mellyssa.bankapi.service;

import com.mellyssa.bankapi.model.User;
import com.mellyssa.bankapi.model.Transaction;
import com.mellyssa.bankapi.repository.UserRepository;
import com.mellyssa.bankapi.repository.TransactionRepository;
import com.mellyssa.bankapi.dto.TransferRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;
    private final TransactionRepository transactionRepository;

    public UserService(UserRepository repository, TransactionRepository transactionRepository) {
        this.repository = repository;
        this.transactionRepository = transactionRepository;
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }
    
    public String transfer(TransferRequest request) {

        User fromUser = repository.findById(request.getFromUserId()).orElseThrow();
        User toUser = repository.findById(request.getToUserId()).orElseThrow();

        if (fromUser.getBalance() < request.getAmount()) {
            return "Saldo insuficiente";
        }

        fromUser.setBalance(fromUser.getBalance() - request.getAmount());
        toUser.setBalance(toUser.getBalance() + request.getAmount());

        repository.save(fromUser);
        repository.save(toUser);

        // salvar histórico
        Transaction transaction = new Transaction();
        transaction.setFromUserId(fromUser.getId());
        transaction.setToUserId(toUser.getId());
        transaction.setAmount(request.getAmount());

        transactionRepository.save(transaction);

        return "Transferência realizada com sucesso!";
    }


}