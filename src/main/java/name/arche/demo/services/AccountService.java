package name.arche.demo.services;

import name.arche.demo.beans.Account;
import name.arche.demo.dao.AccountMapper;
import name.arche.demo.dao.IAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

//    @Autowired
//    IAccountDAO accountDAO;

    @Autowired
    AccountMapper accountMapper;

    @Override
    public int add(Account account) {
        return accountMapper.add(account.getName(), account.getMoney());
    }

    @Override
    public int update(Account account) {
        return accountMapper.update(account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(int id) {
        return accountMapper.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountMapper.findAccount(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }
}
