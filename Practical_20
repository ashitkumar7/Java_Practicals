class LowBalanceException extends Exception

{

	public String getMessage()	{

		return "Sorry! Low Balance. Unable to Withdraw";

	}

	public String toString()

	{

		return "LowBalanceException: Sorry! Low Balance. Unable to Withdraw";

	}

}

class Customer

{

	String name;

	int balance;

	public Customer(String name, int balance)

	{

		this.name=name;

		this.balance=balance;

	}

	public void deposit(int amount)

	{

		balance+=amount;

	}

	public void withdraw(int amount) throws LowBalanceException

	{

		if(amount>balance)

			throw new LowBalanceException();

		balance-=amount;	

	}

	public void showBalance()

	{

		System.out.println("Current Balance is "+balance);

	}

}

class Practical20

{

	public static void main(String args[])

	{

		Customer c1=new Customer("Amit",8000);

		c1.deposit(5000);

		c1.showBalance();

		try

		{

			c1.withdraw(30000);

		}catch(LowBalanceException ex)

		{

			System.out.println(ex.getMessage());

		}

		c1.showBalance();

	}

}
