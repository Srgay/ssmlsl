package cm.itcast.dao;

import cm.itcast.domain.Account;
import org.springframework.stereotype.Repository;

//账户的接口
@Repository
public interface AccountDao {
    //查询所有
     Account login(Account account);

    //注册账户
     void register(Account account);

    //插入数据，保存数据
    public void saveAccount(Account account);

    //修改信息
    public void updateAccount(Account account);

    //删除信息
    public int deleteAccount(Integer AccountId);
}
