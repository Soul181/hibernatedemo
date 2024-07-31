package com.example.hibernatedemo.dao;

import com.example.hibernatedemo.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User getOne(Long id);
    User save(User user);
    User update(User user);
    void deleteById(Long id);
}
