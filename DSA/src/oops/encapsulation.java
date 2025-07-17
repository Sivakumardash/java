package oops;
import java.util.Scanner;
class bank
{
	private int balance=1000;

	public int getBalance() {
		
		return balance;
	}

	public void setBalance(int salary) {
		this.balance = balance+ salary;
		System.out.println("you have salary: 1"+ salary + "and the current balance is:"+balance);
	}
	}
	

	


public class encapsulation {

	public static void main(String[] args) 
	{
		bank b1=new bank();
		// balance=20000  cant do as it is private
		while (true)
		{
			System.out.println("enter 1 to view balance & 2 to set balance: ");
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			switch (x)
			{
			case 1:
				System.out.println(b1.getBalance());
				break;
			case 2:
				System.out.println("enter the sakary");
				int y=sc.nextInt();
				b1.setBalance(y);
				break;
			default:
				System.out.println("enter the correct option");
				
				
			}
		}
		
		

	}

}
