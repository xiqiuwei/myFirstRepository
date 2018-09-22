package com.itheima.sh.dao;

import com.itheima.sh.domain.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 保存账户
     * @param account
     */
    void save(Account account);

    /**
     * 更新账户
     */
    void update(Account account);

    /**
     * 根据id删除账户
     * @param id
     */
    void delete(Long id);

    /**
     * 查询某个账户的余额
     */
    Double findMoney(Long id);

    /**
     * 根据id查询账户对象
     */
    Account findById(Long id);

    /**
     * 查询所有账户
     */
    List<Account> findAll();
}
