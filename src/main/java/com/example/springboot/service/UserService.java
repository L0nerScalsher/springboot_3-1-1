package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(Long id);

    List<User> getUsers();

    User getUserById(Long id);
}
