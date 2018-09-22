package com.itheima.sh.dao.impl;

import com.itheima.sh.dao.CustomerDao;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("客户端:用户保存!!");
    }

    @Override
    public Integer delete() {
        System.out.println("客户端:用户删除");
        return 10090;
    }

    @Override
    public void update() {
        System.out.println("用户更新");
    }

    @Override
    public void query() {
        System.out.println("用户查找");
        //异常;
        int i = 1/0;
    }
}
