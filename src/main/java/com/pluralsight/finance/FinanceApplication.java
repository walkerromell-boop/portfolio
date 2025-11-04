package com.pluralsight.finance;

import com.pluralsight.CheckingAccount;
import com.pluralsight.CreditCard;

public class FinanceApplication {
    public static void main(String[] args) {

        CheckingAccount account1= new CheckingAccount("Billy","1233050",15560.25);
        CreditCard account2= new CreditCard("Bobby","2645377",100000);

        account1.deposit(50);
        account2.charge(200);
        System.out.println(account1);
        System.out.println(account2);



    }
}
