package com.acme.banking.dbo.ooad;

import java.util.Collection;

public class Framework {
    public static void main(String[] args) {
        ReportingService reportingService = new ReportingService(
                new NostalgieXchanheService(30),
                new AccountRepository()
        );

        Collection<Account> accounts = reportingService.getAllAccountInUsd();

        accounts.forEach(System.out::println);
    }
}
