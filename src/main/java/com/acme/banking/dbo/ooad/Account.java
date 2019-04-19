package com.acme.banking.dbo.ooad;

public abstract class Account {
    private double overdraft;
    private double amount;
    private long id;

    public Account(long id, double amount, double overdraft) {
        this.amount = amount;
        this.overdraft = overdraft;
        this.id = id;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public double getAmount() {
        return amount;
    }

    public long getId() {
        return id;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
}
