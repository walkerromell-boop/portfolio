package com.pluralsight;

public class CreditCard extends Account {
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public double getValue() {
        return getBalance();
    }

    public void charge(double amount) {
        super.setBalance(getBalance() + amount);
    }

    public void pay(double amount) {
        super.setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "CreditCard:" + getBalance();
    }
}
