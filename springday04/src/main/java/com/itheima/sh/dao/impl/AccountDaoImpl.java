package com.itheima.sh.dao.impl;

import com.itheima.sh.dao.AccountDao;
import com.itheima.sh.domain.Account;
import com.itheima.sh.rowmapper.AccountRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void save(Account account) {

    }

    /**
     *
     * @param account
     */
    @Override
    public void update(Account account) {
        this.jdbcTemplate.update("update account set name = ? , money = ? where id = ?",account.getName(),
                account.getMoney(),account.getId());
    }

    /**
     *
     * @param id
     */
    @Override
    public void delete(Long id) {
        this.jdbcTemplate.update("delete from account where id = ?",id);

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Double findMoney(Long id) {
        return this.jdbcTemplate.queryForObject("select money from account where id = ?",Double.class,id);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Account findById(Long id) {
        return this.jdbcTemplate.queryForObject("select * from account where id = ?",new AccountRowMapper(),id);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Account> findAll() {
        return this.jdbcTemplate.query("select * form account",new AccountRowMapper());
    }
}
