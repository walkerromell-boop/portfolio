package com.pluralsight;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }
    public void deposit(double amount){
        super.setBalance(getBalance()+amount);
    }

    public void withDraw(double amount){

    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount:" + getBalance();
    }
}
