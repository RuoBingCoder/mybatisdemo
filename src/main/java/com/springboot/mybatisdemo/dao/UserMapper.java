package com.springboot.mybatisdemo.dao;

import com.springboot.mybatisdemo.pojo.User;

import java.util.List;

/**
 * @author : 石建雷
 * @date :2019/2/27
 */

public interface UserMapper {
    /**
     * 添加用户
     *
     * @param user
     */
    void insertUser(User user);

    List<User> findUserAll();

    User findByUserId(Integer id);

    void updateUser(User user);

    void deleteUserById(Integer id);

}
