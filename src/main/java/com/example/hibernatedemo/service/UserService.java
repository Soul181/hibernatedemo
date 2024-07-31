package com.example.hibernatedemo.service;

import com.example.hibernatedemo.dao.UserDaoImpl;
import com.example.hibernatedemo.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserDaoImpl usersDaoImpl = new UserDaoImpl();
    public UserService() {}

    public List<User> findAll() {
        return usersDaoImpl.findAll();
    }

    public User findById(Long id) {
        return usersDaoImpl.getOne(id);
    }

    public User saveUser(User user) {
        return usersDaoImpl.save(user);
    }

    public User updateUser(User user) {
        return usersDaoImpl.update(user);
    }

    public void deleteById(Long id) {
        usersDaoImpl.deleteById(id);
    }
}
