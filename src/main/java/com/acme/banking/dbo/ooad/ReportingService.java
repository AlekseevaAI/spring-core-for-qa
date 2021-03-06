package com.acme.banking.dbo.ooad;

import java.util.Collection;

public class ReportingService {
    private AccountRepositoryStub repository;
    private XchangeService xchangeService;

    public ReportingService(XchangeService xchangeService, AccountRepositoryStub repository){
        this.repository = repository;
        this.xchangeService = xchangeService;
    }

    public Collection<Account> getAllAccountInUsd(){

        Collection<Account> acc = repository.getAllAccounts();
        acc.forEach(account -> account.setAmount(account.getAmount()/xchangeService.getRate()));

        return acc;
    }

}
