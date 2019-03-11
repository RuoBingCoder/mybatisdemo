package com.springboot.mybatisdemo.service;

import com.springboot.mybatisdemo.dao.UserMapper;
import com.springboot.mybatisdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : 石建雷
 * @date :2019/2/27
 */
@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);

    }

    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }

    @Override
    public User findByUserId(Integer id) {
        return userMapper.findByUserId(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
      userMapper.deleteUserById(id);
    }
}
