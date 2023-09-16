package MoneyApp;

import java.util.*;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			BankAccount acc1 = new BankAccount("465329874");
			BankAccount acc2 = new BankAccount("230932131");
			BankAccount acc3 = new BankAccount("203921321",3201.32);
			
			
			acc1.setName("Jimmy");
			System.out.println(acc1.getClass());
			System.out.println(acc1.toString());
			acc3.showBalance();
			acc3.accrue();
	}

}

class BankAccount implements IInterest {
	
	// Properties of bank account
	private static int iD = 1001 ;				// Internal iD
	private String accountNumber; 	// iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "023132113";	// 
	private String name;
	private String SSN;
	private double Balance;
	
	
	// Constructor
	public BankAccount(String SSN) {
		System.out.println("New Account Created");
		this.SSN = SSN; // Instance SSN becomes local variable 
		iD ++;
		setAccountNumber();
		
	}
	
	public BankAccount(String SSN, double initDeposit) {
		Balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN; // Instance SSN becomes local variable 
		iD ++;
		setAccountNumber();
	}
		
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,1);
		System.out.println("Your Account Number:" + accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	// These are two ways to override and return a string of the account owner. 
	
	public String getName() {
		return name;
	}

	
	public String toString() {
		return "The name of this account owner is : " + name; 
	}
	
	public void payBill(double amount) {
		System.out.println("Paying Bill: " + amount);
		Balance = Balance - amount;
		showBalance();
		
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		Balance = Balance+amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + Balance);
	}
	

	@Override
	public void accrue() {
		Balance = Balance * (1+ rate/100);
		showBalance();
		
		
	}
}
