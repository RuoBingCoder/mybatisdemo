package com.springboot.mybatisdemo.service;

import com.springboot.mybatisdemo.pojo.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> findUserAll();

    User findByUserId(Integer id);

    void updateUser(User user);

    void deleteUserById(Integer id);
}
