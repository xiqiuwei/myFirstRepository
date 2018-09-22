package com.itheima.sh.service;

import com.itheima.sh.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查找所有用户
     * @return
     */
    List<User> findAllUsers();

    /**
     * 保存所有用户
     * @param user
     */
    void saveUser(User user);
}
