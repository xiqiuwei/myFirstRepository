package com.itheima.sh.service;

import com.itheima.sh.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     *
     * @param fromId 转出账户
     * @param toId 转入账户
     * @param money 转出入的钱
     */
    void transfer(Long fromId, Long toId, Double money);

    /**
     * 根据id查询账户对象
     * @param id
     * @return
     */
    Account findById(Long id);

    List<Account> findAllAccount();
}
