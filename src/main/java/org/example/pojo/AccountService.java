package org.example.pojo;

import org.example.pojo.Account;

public interface AccountService {
    void transferMoney(long fromaAccountId, long toAccountId,double amount);
    void  depositMoney(long accountId,double amount) throws Exception;
    Account getAccount(long accountId);
}
