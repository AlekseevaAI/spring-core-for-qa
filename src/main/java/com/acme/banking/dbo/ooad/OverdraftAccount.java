package com.acme.banking.dbo.ooad;


public class OverdraftAccount extends Account {

    public OverdraftAccount(long id, double amount, double overdraft) {
        super(id, amount, overdraft);
    }

    //@Override
    //protected boolean validate(double amount) {
    //    return super.validate(amount - overdraft);
    //}
}
