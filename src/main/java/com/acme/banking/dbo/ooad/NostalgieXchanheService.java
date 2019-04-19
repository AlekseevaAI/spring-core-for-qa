package com.acme.banking.dbo.ooad;

public class NostalgieXchanheService implements XchangeService {

    private int rate;

    NostalgieXchanheService(int rate){
        this.rate = rate;
    }

    @Override
    public int getRate() {
        return rate;
    }
}
