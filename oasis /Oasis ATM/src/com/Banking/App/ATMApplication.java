
package com.Banking.App;

import java.util.List;
import java.util.Scanner;

//Main class representing the ATM application
public class ATMApplication {
    static data data=new data();
    
    public static void main(String[] args) {
        data.add();
        Scanner scanner = new Scanner(System.in);
        // User authentication
        System.out.print("Enter User Name: ");
        String enteredUserName = scanner.next();
        System.out.print("Enter User PIN: ");
        String enteredUserPin = scanner.next();


        if (Login(enteredUserName, enteredUserPin)) {
                System.out.println("Login successful!");
                // Perform banking operations here
                performTransactions(getAccountByUsername(enteredUserName));

            } else {
                System.out.println("Login failed. Invalid username or password.");
            } 
            
    }


    //login method 
    public static boolean Login(String username, String password) {
        BankAccount foundAccount = getAccountByUsername(username);
        if (foundAccount != null) {
            System.out.println("----User Details ---");
            System.out.println("\nName :"+foundAccount.getName());
            System.out.println("Account Number :" +foundAccount.getAccountNo());
            System.out.println("Balance :"+foundAccount.getBalance()+"\n");
            return foundAccount.getPassword().equals(password);
        }else {
            System.out.println("Account not found for username '" + username + "'.");
                return false;
            }
    }

    /* This function is used to retrieve an account by its username */
    public static BankAccount getAccountByUsername(String username) {
        List<BankAccount> detailsAccounts = data.accounts;
        for (BankAccount account : detailsAccounts) {
            if (account.getUserName().equals(username)){
                return account; // Return the account if username matches
            }
        }
        System.out.println("Account not found\n");
        return null; // Return null if no matching account is found
    }



    
// Method to perform ATM transactions
private static void performTransactions(BankAccount account) {
    int count=0;
    int choice;
    float balance;
    Scanner scanner = new Scanner(System.in);
    do {
        count+=1;
        // Display menu
        System.out.println("\nATM Menu:");
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");

        // Get user choice
        choice = scanner.nextInt();

        // Perform selected operation
        switch (choice) {
            case 1:
                account.displayTransactionHistory();
                break;
                
            case 2:
                System.out.print("Enter withdrawal amount: ");
                float withdrawalAmount = scanner.nextFloat();
                balance=(float)account.WithDraw(account.getBalance(), withdrawalAmount);
                data.changeBalance(account.getUserName(),balance);
                System.out.println("withdrawal successful.\n New balance: " + account.getBalance());
                break;
                
                
            case 3:
                System.out.print("Enter deposit amount: ");
                float depositAmount = scanner.nextFloat();
                balance=(float)account.Deposit(account.getBalance(),depositAmount);
                System.out.println("Deposit successful.\n New balance: " + account.getBalance());
                break;
            case 4:
                System.out.print("Enter recipient's User ID: ");
                String recipientUserName = scanner.next();
                
                System.out.print("Enter transfer amount: ");
                double transferAmount = scanner.nextDouble();

               //  // Assuming a simple case where the recipient has the same PIN as the sender
               //  BankAccount recipientAccount = new BankAccount(recipientUserId, account.getPin());
               //  account.Transfer(recipientUserName, transferAmount);

                
                break;
            case 5:
                System.out.println("Quitting ATM. Thank you for using our services!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    } while (choice != 5||count!=2);
}

}


