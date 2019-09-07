//	To represent the a credit card

public class CreditCard
{
	private Money balance;		//the current balance
	private Money creditLimit;	//the approved credit limit
	private Person owner;		//the owner of the credit card

	//Constructor creates a credit card for the Person parameter
	//with an approved credit limit of the Money parameter
	//and sets the balance to a Money amount of zero 
	public CreditCard(Person newCardholder, Money limit) 
	{
		this.owner = newCardholder;
		this.balance = new Money(0);
		this.creditLimit = limit;
	}

	//Accessor method returns the balance
	public Money getBalance()
	{
		return this.balance;
	}

	//Accessor method returns the credit limit
	public Money getCreditLimit()
	{
		return this.creditLimit;
	}

	//Accessor method returns information about the owner
	public String getPersonals()
	{
		return this.owner.toString();
	}
	
	//Method to make a charge to the credit card, if
	//the credit limit will not be exceded
	public void charge(Money amount)
	{
		if(creditLimit.compareTo(amount) == 1){
			this.balance = this.balance.add(amount);
		}
	}

	//Method to make a payment to the credit card
	public void payment(Money amount)
	{
		this.balance = this.balance.subtract(amount);
	}		
}