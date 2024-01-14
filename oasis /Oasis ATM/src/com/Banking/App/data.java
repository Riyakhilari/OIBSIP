package com.Banking.App;

import java.util.ArrayList;
import java.util.List;

public class data {
    List<BankAccount> accounts = new ArrayList<>();
    public void add(){
        accounts.add(new BankAccount("Riya Khilari", "riya_khilari", "pass123", "AC1001", 1234, 5000.0, 0, ""));
        accounts.add(new BankAccount("Alice Smith", "alice_smith", "alice_pass", "AC1002", 5678, 10000.0, 0, ""));
        accounts.add(new BankAccount("Bob Johnson", "bob_johnson", "bob_pass", "AC1003", 9876, 7500.0, 0, ""));
        accounts.add(new BankAccount("Eva Green", "eva_green", "eva_pass", "AC1004", 4321, 12000.0, 0, ""));
        accounts.add(new BankAccount("Michael Brown", "michael_brown", "michael_pass", "AC1005", 1357, 8500.0, 0, ""));
        accounts.add(new BankAccount("Sophie White", "sophie_white", "sophie_pass", "AC1006", 2468, 9500.0, 0, ""));
        accounts.add(new BankAccount("Charlie Black", "charlie_black", "charlie_pass", "AC1007", 7890, 6000.0, 0, ""));
        accounts.add(new BankAccount("Olivia Miller", "olivia_miller", "olivia_pass", "AC1008", 1593, 11000.0, 0, ""));
        accounts.add(new BankAccount("William Wilson", "william_wilson", "william_pass", "AC1009", 3579, 7800.0, 0, ""));
        accounts.add(new BankAccount("Ava Davis", "ava_davis", "ava_pass", "AC1010", 2468, 10500.0, 0, ""));
        accounts.add(new BankAccount("Liam Moore", "liam_moore", "liam_pass", "AC1011", 1470, 9200.0, 0, ""));
        accounts.add(new BankAccount("Emma Clark", "emma_clark", "emma_pass", "AC1012", 2580, 8700.0, 0, ""));
        accounts.add(new BankAccount("Noah Turner", "noah_turner", "noah_pass", "AC1013", 3690, 9800.0, 0, ""));
        accounts.add(new BankAccount("Mia Hall", "mia_hall", "mia_pass", "AC1014", 7531, 7200.0, 0, ""));
        accounts.add(new BankAccount("James Brooks", "james_brooks", "james_pass", "AC1015", 9513, 8800.0, 0, ""));
        accounts.add(new BankAccount("Sophia Hayes", "sophia_hayes", "sophia_pass", "AC1016", 2468, 10400.0, 0, ""));
        accounts.add(new BankAccount("Logan Price", "logan_price", "logan_pass", "AC1017", 3690, 9400.0, 0, ""));
        accounts.add(new BankAccount("Avery Wood", "avery_wood", "avery_pass", "AC1018", 7531, 8000.0, 0, ""));
        accounts.add(new BankAccount("Elijah Reed", "elijah_reed", "elijah_pass", "AC1019", 9513, 9200.0, 0, ""));
        accounts.add(new BankAccount("Aria Fisher", "aria_fisher", "aria_pass", "AC1020", 2468, 11000.0, 0, ""));

    }
    
    public void printAllAccounts() {
        System.out.println("Printing all accounts:");

        for (BankAccount account : accounts) {
            System.out.println("Name: " + account.getName());
            System.out.println("UserName: " + account.getUserName());
            System.out.println("Password: " + account.getPassword());
            System.out.println("AccountNo: " + account.getAccountNo());
            System.out.println("Pin: " + account.getPin());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("TransactionsCount: " + account.getTransactionsCount());
            System.out.println("TransactionHistory: " + account.getTransactionHistory());
            System.out.println("-------------------------------");
        }
    }


	// Method to change balance for a specific username
    public void changeBalance(String username, float newBalance) {
        BankAccount account = getAccountByUsername(username);
        if (account != null) {
            account.setBalance(newBalance);
            System.out.println("Balance changed successfully for username '" + username + "'.");
        } else {
            System.out.println("Account not found for username '" + username + "'.");
        }
    }
	private BankAccount getAccountByUsername(String username) {
        
        for (BankAccount account : accounts) {
            if (account.getUserName().equals(username)) {
                return account;
            }
        }
        return null;
    }

    public void addTransaction(String username, String transaction) {
        BankAccount account = getAccountByUsername(username);
        if (account != null) {
            account.addTransactionToHistory(transaction);
            System.out.println("Transaction added successfully for username '" + username + "'.");
        } else {
            System.out.println("Account not found for username '" + username + "'.");
        }
    }
}
