package com.itheima.sh.dao;

import com.itheima.sh.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountDaoTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void test1() {
        accountService.transfer(1L,2L,998.8);
    }

    @Test
    public void test2() {
        accountService.findById(1L);
    }

    @Test
    public void delete() {
    }

    @Test
    public void findMoney() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findAll() {
    }
}