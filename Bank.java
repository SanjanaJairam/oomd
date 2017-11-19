public class Bank
{
	public static void main (String [] Args)
	{
		System.out.println("Welcome to our bank!");
		System.out.println("Savings Account");
		savingsAccount sa = new Creator().create("Savings","Sangeetha", 3000.0);
		//savingsAccount sa= new savingsAccount("Sangeetha", 3000);
		double b1 = sa.getBalance();
		System.out.println("Initial Balance:"+b1);
		sa.deposit(2000.0);
		double balance = sa.withdraw(1000.0);
		System.out.println("New balance is :"+balance);
		Interest i = new Interest();
		double interest = i.calcInterest(sa);
		System.out.println("The interest is :"+interest);
		System.out.println("-------------------------------"); 
		//Showing overriding
	  	System.out.println("Savings Account2"); 
	  	savingsAccount acc = new Creator().create("Savings","Saachi", 2000.0);
	   	//Account acc= new savingsAccount("Saachi", 2000);
		double b2 = acc.getBalance();
		System.out.println("Initial Balance:"+b2);
		acc.deposit(1000.0);
		double balance2 = acc.withdraw(5000.0);
		System.out.println("New balance is :"+balance2);
		Interest i1 = new Interest();
		double interest1 = i1.calcInterest(sa);
		System.out.println("The interest is :"+interest1);
		System.out.println("-------------------------------"); 
		System.out.println("Current Account - Allowing you to withdraw more than your balance");
		currentAccount ca = new Creator().create("Current","Sanjana", 4000.0);
		//Account ca= new currentAccount("Sanjana", 4000);
		double b3 = ca.getBalance();
		System.out.println("Initial Balance:"+b3);
		double balance3 = ca.withdraw(5000.0);
		System.out.println("New balance is :"+balance3);
			
	}

}
