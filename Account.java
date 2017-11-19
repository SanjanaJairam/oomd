public class Account
{
	protected double balance;
	protected String name;
	
    public Account()
    {
    	this.name="";
    	this.balance=0;
    }
    
	public Account(String name, int balance)
	{
		this.name=name;
		this.balance=balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void deposit(int sum)
	{
		this.balance+=sum;
		  System.out.println("Depositing.."+sum);
	   
		System.out.println("your new balance is :" + balance);

	}

	public double withdraw(double difference)
	{  
		if(difference>this.balance)
	   	{
	   		System.out.println("Withdrawing.."+difference);
			System.out.println("Not possible - Savings Account balance low");
	 	}
	   	else 
	   	{
	   		this.balance-=difference;
	   		System.out.println("Withdrawing.."+difference);
	   		System.out.println("Withdrawing sucessful");
	   	}       
	  	return this.balance;
	}

}

class savingsAccount extends Account
{
	private double interest = 8.75;
	
	public savingsAccount()
	{
		super();
	}
	
    public savingsAccount(String name, int balance)
    {
        super(name,balance);
    }
	
	public double getInterest()
	{
		return this.interest;
	}
}

class currentAccount extends Account
{
	private double interest = 0;
	
	public currentAccount()
	{
		super();
	}
	
    public currentAccount(String name, int balance)
    {
        super(name,balance);
    }
    
    public double getInterest()
	{
		return this.interest;
	}
	//method overriding - Polymorphism - GRASP Principle
	public double withdraw(double difference)
	{  
		this.balance-=difference;
		System.out.println("Withdrawing.."+difference);
	    System.out.println("Withdrawing sucessful");
		return this.balance;

	 }
}

