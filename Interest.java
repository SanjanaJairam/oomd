class Interest{

	public double calcInterest(savingsAccount a)
	{
		double interest = (a.balance*a.getInterest())/100;
		return interest;
	}

}
