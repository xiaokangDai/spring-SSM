package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public List<Account> fiandAll() {
        System.out.println("业务层：查询所有账户信息");
        return accountDao.fiandAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层，保存所有账户信息");
        accountDao.saveAccount(account);
    }
}
