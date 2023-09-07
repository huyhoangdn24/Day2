package dependencyinjection;

import org.example.pojo.Account;
import org.example.pojo.AccountRepository;
import org.example.pojo.AccountService;

public class AccountServiceConstructorImpl implements AccountService {
    private AccountRepository accountRepository;
public AccountServiceConstructorImpl (AccountRepository accountRepository){
    this.accountRepository=accountRepository;
}
    @Override
    public void transferMoney(long fromaAccountId, long toAccountId, double amount) {
        Account sourceAccount = accountRepository.find(fromaAccountId);
        Account targetAccount = accountRepository.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        sourceAccount.setBalance(sourceAccount.getBalance()+ amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance() + amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }

}

