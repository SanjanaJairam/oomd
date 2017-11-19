class Creator
{

	public static Account create(String type, String name, double balance)
	{
		if(type.equals("Savings"))	
		{
			return new savingsAccount(name, balance);
		}
		else
		{
			return new currentAccount(name, balance);
		
		}
	}



}
