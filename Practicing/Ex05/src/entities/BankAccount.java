package entities;

public class BankAccount {
	private int accountNumber;
	public String holderName;
	private double balance;	
	
	// Constructors
	
	public BankAccount(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = 0;
	}
		
	public BankAccount(int accountNumber, String holderName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(initialDeposit);
	}

	// Getters and setters
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}
	
	// Other methods
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}

	public String accountData() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ holderName
				+ ", Balance: $ "
				+ String.format("%.2f", getBalance());
	}
}
