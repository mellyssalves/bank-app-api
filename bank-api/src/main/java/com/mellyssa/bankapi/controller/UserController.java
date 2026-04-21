package com.mellyssa.bankapi.controller;

import com.mellyssa.bankapi.model.User;
import com.mellyssa.bankapi.service.UserService;
import com.mellyssa.bankapi.dto.TransferRequest;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @PostMapping("/transfer")
    public String transfer(@RequestBody TransferRequest request) {
        return service.transfer(request);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
}