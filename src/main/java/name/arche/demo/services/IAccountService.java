package name.arche.demo.services;

import name.arche.demo.beans.Account;

import java.util.List;

public interface IAccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
