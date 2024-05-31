package boi.com;
class Account
{
	String name="Adithya";
	int balance=20000;
	int acc_no=30140;
	public void display()
	{
		System.out.println("\nEmployee Name: " +name+ "\nAccount No.: " +acc_no+ "\nAvailble Balance:Rs." +balance);
	}
}

class FDAccount extends Account
{
	int loan_amount=2000;
	public void displayloan()
	{
		int available_balance=loan_amount;
		System.out.println("My loan amount is Rs." +available_balance);
	}
}
public class Inheritance
{
	public static void main(String[] args)
		{	
		FDAccount emp1=new FDAccount();
		emp1.display();
		emp1.displayloan();
		}
	
}
