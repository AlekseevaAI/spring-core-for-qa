package com.acme.banking.dbo.ooad;

import java.util.ArrayList;
import java.util.Collection;

public class AccountRepositoryStub {

    public Collection<Account> getAllAccounts(){

        Account a = new SavingAccount(1, 210);
        Account b = new OverdraftAccount(2, 300, 50);

        ArrayList<Account>  accounts = new ArrayList<>();
        accounts.add(a);
        accounts.add(b);

        return accounts;

    }
}
