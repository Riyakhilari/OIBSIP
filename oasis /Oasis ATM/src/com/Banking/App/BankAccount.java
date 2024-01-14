package com.Banking.App;

public class BankAccount {
	data data=new data();
	private String name;
    private String userName;
    private String password;
    private String accountNo;
    private int pin;
    private float balance;
    private int transactionsCount;
    private String transactionHistory;
    
	public void addTransactionToHistory(String transaction) {
        this.transactionHistory += transaction;
    }
	
	public String getName() {
		return name;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getPin() {
		return pin;
	}

	public float getBalance() {
		return balance;
	}

	public int getTransactionsCount() {
		return transactionsCount;
	}

	public String getTransactionHistory() {
		return transactionHistory;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setTransactions(int transactions) {
		this.transactionsCount = transactions;
	}

	public void setTransactionHistory(String transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	/**
	 * @param name
	 * @param userName
	 * @param password
	 * @param accountNo
	 * @param d
	 * @param transactions
	 * @param transactionHistory
	 */
	public BankAccount(String name, String userName, String password, String accountNo, int pin, double balance,
                   int transactionsCount, String transactionHistory) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.accountNo = accountNo;
        this.pin = pin;
        this.balance = (float) balance;
        this.transactionsCount = transactionsCount;
        this.transactionHistory = transactionHistory;
    }
	public BankAccount(){
		
	}

	public BankAccount(String name, String userName, String password, String accountNo, int pin, float balance, int transactions) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.accountNo = accountNo;
        this.pin = pin;
        this.balance = balance;
        this.transactionsCount = transactions;
    }

	
	// Method to display transaction history
    
    
	
	
	
	//	System.out.println("1. Transactions History");
	public void displayTransactionHistory() {
        System.out.println("Transaction History: Not implemented in this outline.");
	}
	
	
//    System.out.println("2. Withdraw");

	public double WithDraw(float balance,float amountWithDraw)
	{
		transactionsCount++;
		if(amountWithDraw<balance) 
		{
			
			balance=balance-amountWithDraw;
			System.out.println("amountWithDraw :"+amountWithDraw);
			System.out.println("balance :"+balance);
			System.out.println("\nSuccessfully Deposited");
			String str = balance + " Rs WithDrawed\n";
			transactionHistory = transactionHistory.concat(str);
			
			return balance;
		}
		else {
			System.out.println("\nUnSuccessfully Deposited");
			return 1;
		}
		
	}
//    System.out.println("3. Deposit");
	
	public double  Deposit(float balance,float amountDeposit) {
		
		balance =balance+ amountDeposit;
		System.out.println("amountDeposit :"+amountDeposit);
		System.out.println("\nSuccessfully Deposited");
		String str = balance + " Rs deposited\n";
		transactionHistory = transactionHistory.concat(str);
		System.out.println("New Balance : "+ balance);
		System.out.println("balance :"+balance);
		return balance;
	}
//    System.out.println("4. Transfer");
	public void Transfer(String recipientAccount,double amountTransfer) {
		
		
		if ( balance >= amountTransfer ) {
			transactionsCount++;
			balance -= amountTransfer;
			System.out.println("\nSuccessfully Transfered to " + recipientAccount);
			String str = amountTransfer + " Rs transfered to " + recipientAccount + "\n";
			transactionHistory = transactionHistory.concat(str);
			System.out.println("Transfer successful. New balance: " + balance);
		}
	}

}
