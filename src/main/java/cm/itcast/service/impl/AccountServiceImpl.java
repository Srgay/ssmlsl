package cm.itcast.service.impl;

import cm.itcast.dao.AccountDao;
import cm.itcast.domain.Account;
import cm.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    //登录
    @Override
    public Account login(Account account) {
        Account a= accountDao.login(account);
        return a;
    }

    //注册
    @Override
    public void register(Account account) {

        accountDao.register(account);
    }
    //登录




    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存信息");
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("业务层，修改信息");
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer AccountId) {
        System.out.println("业务层，删除信息");
        accountDao.deleteAccount(AccountId);
    }
}
