package com.edilov.springMVC.service;

import com.edilov.springMVC.models.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUserById(int id);
}
