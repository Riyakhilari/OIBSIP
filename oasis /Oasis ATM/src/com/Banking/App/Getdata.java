package com.Banking.App;

import java.util.List;

public class Getdata {
    public static void main(String[] args) {
        data data = new data();
        data.add();

        List<BankAccount> detailsAccounts = data.accounts;

        for (BankAccount account : detailsAccounts) {
            System.out.println(account.getUserName());
            if (account.getUserName().equals("elijah_reed")) {
                System.out.println("Account found\n");
                // Return the account if username matches
            }
        }
    }
}
