//Authors: Katherine O'Roark
public class BankAccount {
	private String accountNumber;
	private double balance;
	private String accountHolderName;
	private boolean isSavingsAccount;
	
	public BankAccount(String accountNumber, double balance, String accountHolderName, boolean isSavingsAccount)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.isSavingsAccount = isSavingsAccount;
	}
	
	public String getaccountNumber()
	{
		return accountNumber;
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	public String getaccountHolderName()
	{
		return accountHolderName;
	}
	
	public boolean getisSavingsAccount()
	{
		return isSavingsAccount;
	}
	
	public boolean isBalanceZero()
	{
		return balance == 0.0;
	}
	
	public double Deposit(double dep)
	{
		double newB = balance + dep;
		return newB;
	}
	
	public double Withdrawal(double with)
	{
		if(balance <= 0.00)
		{
			System.out.print("Withdrawal error: insufficient balance. ");
			return balance;
		}
		else
		{
			double newBal = balance - with; 
			if(newBal < 0.00)
			{
				System.out.print("Withdrawal error: insufficient balance");
				return balance;					
			}
			else
			{
				return newBal;
			}
		}
	}
	
	public static void main(String[] args) {
		//part A
		BankAccount one = new BankAccount("123", 23.00, "Billy", true);
		BankAccount two = new BankAccount("456", 123.00, "Smith", true);
		BankAccount three = new BankAccount("789", 232.00, "Alice", false);
		BankAccount four = new BankAccount("100", 0.00, "Mary", false);
		BankAccount five = new BankAccount("999", 2133.00, "Susan", false);
		System.out.println("Account 1: Is Balance Zero?: " + one.isBalanceZero());
		System.out.println("Account 2: Is Balance Zero?: " + two.isBalanceZero());
		System.out.println("Account 3: Is Balance Zero?: " + three.isBalanceZero());
		System.out.println("Account 4: Is Balance Zero?: " + four.isBalanceZero());
		System.out.println("Account 5: Is Balance Zero?: " + five.isBalanceZero());
		
		//part D- Deposit
		System.out.println("\n" + one.accountHolderName + " deposits 5.00. New Balance: " + one.Deposit(5.00));
		System.out.println(two.accountHolderName + " deposits 10.00. New Balance: " + two.Deposit(10.00));
		System.out.println(three.accountHolderName + " deposits 100.00. New Balance: " + three.Deposit(100.00));
		System.out.println(four.accountHolderName + " deposits 0.00. New Balance: " + four.Deposit(0.00));
		System.out.println(five.accountHolderName + " deposits 5000.00. New Balance: " + five.Deposit(5000.00));
		
		//part D- Withdrawal	
		System.out.println("\n" + one.accountHolderName + " withdrawals 10.00. New Balance: " + one.Withdrawal(10.00));
		System.out.println(two.accountHolderName + " withdrawals 10.00. New Balance: " + two.Withdrawal(10.00));
		System.out.println(three.accountHolderName + " withdrawals 100.00. New Balance: " + three.Withdrawal(100.00));
		System.out.println(four.accountHolderName + " withdrawals 10.00. New Balance: " + four.Withdrawal(10.00));
		System.out.println(five.accountHolderName + " withdrawals 50.00. New Balance: " + five.Withdrawal(50.00));
	}

}
