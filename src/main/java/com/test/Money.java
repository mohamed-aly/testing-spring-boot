package com.test;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        Money dollar = (Money) obj;
        return this.amount==((Money) obj).amount;
    }
}
