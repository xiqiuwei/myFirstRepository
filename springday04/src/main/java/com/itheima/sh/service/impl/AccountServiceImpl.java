package com.itheima.sh.service.impl;

import com.itheima.sh.dao.AccountDao;
import com.itheima.sh.domain.Account;
import com.itheima.sh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
//该类中所有的事务都加可读写事务
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(Long fromId, Long toId, Double money) {
        /**
         * 查询转出账户
         */
        Account fromAccount = accountDao.findById(fromId);

        /**
         * 查询转入账户
         */
        Account toAccount = accountDao.findById(toId);

        /**
         * 转出账户减钱
         */
        fromAccount.setMoney((fromAccount.getMoney()) - money);

        /**
         * 转入账户加钱
         */
        toAccount.setMoney((toAccount.getMoney()) + money);

        /**
         * 更新转出账户
         */
        accountDao.update(fromAccount);
        int i = 1/0;

        /**
         * 更新转入账户
         */
        accountDao.update(toAccount);
    }

    @Override
    //只读事务
    @Transactional(readOnly = true)
    public Account findById(Long id) {
        Account account = accountDao.findById(id);
        account.setMoney(10000.0);
        accountDao.update(account);
        return account;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAll();
    }
}
