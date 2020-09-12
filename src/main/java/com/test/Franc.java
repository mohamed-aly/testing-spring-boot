package com.test;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    Franc times(int multiplier){

        return new Franc(amount*multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return this.amount==franc.getAmount();
    }
}
