package com.itheima.sh.service.impl;

import com.itheima.sh.domain.User;
import com.itheima.sh.mapper.UserMapper;
import com.itheima.sh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    /**
     * 保存用户
     * @param user
     */
    @Override
    public void saveUser(User user) {
       userMapper.saveUser(user);

    }
}
