package com.edilov.springMVC.dao;

import com.edilov.springMVC.models.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUsers();
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUserById(int id);
}