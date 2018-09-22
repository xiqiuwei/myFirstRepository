package com.itheima.sh.mapper;

import com.itheima.sh.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUsers();

    /**
     * 保存用户
     */
    void saveUser(User user);
}
