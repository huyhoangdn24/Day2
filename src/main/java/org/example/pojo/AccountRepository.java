package org.example.pojo;

import org.example.pojo.Account;

public interface AccountRepository {
    void insert(Account account);
    void update(Account account);
    Account find(long accountId);
}
