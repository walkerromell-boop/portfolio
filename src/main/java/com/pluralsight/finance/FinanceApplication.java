package com.pluralsight.finance;

import com.pluralsight.CheckingAccount;
import com.pluralsight.CreditCard;
import com.pluralsight.Portfolio;
import com.pluralsight.Valuable;

import java.util.ArrayList;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Networth", "Superman");
        CheckingAccount account1 = new CheckingAccount("Billy", "1233050", 15560.25);
        CreditCard account2 = new CreditCard("Bobby", "2645377", 100000);





        portfolio.addValuable(account1);
        portfolio.addValuable(account2);
        account1.deposit(50);
        account2.charge(200);
        account2.pay(5000);
//        System.out.println(account1);
//        System.out.println(account2);
        System.out.println("Total amount of valuables: " + portfolio.getValue());
        System.out.println(portfolio.getMostValuable());
        System.out.println(portfolio.getLeastValuable());


    }
}
