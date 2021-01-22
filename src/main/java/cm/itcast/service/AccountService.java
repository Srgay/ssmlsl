package cm.itcast.service;

import cm.itcast.domain.Account;

public interface AccountService {


    //注册账户
    public void register(Account account);


    //登录
    public Account login(Account account);

    //插入数据，保存数据
    public void saveAccount(Account account);

    //修改信息
    public void updateAccount(Account account);

    //删除信息
    public void deleteAccount(Integer AccountId);

}
