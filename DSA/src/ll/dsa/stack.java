package ll.dsa;
import java.util.Scanner;
public class stack 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
		int top=-1;
		System.out.println("enter the maximum size of a array");
		int x=sc.nextInt();
		int a[]=new int[x];
		while(true)
		{
		System.out.println("enter your choise:");
		System.out.println("1 to push , 2 to pop, 3 to display");
		int choise=sc.nextInt();
		switch(choise)
		{
		case 1:
			top=push(a,top);
			break;
		case 2:
			top=pop(a,top);
			break;
		case 3:
			display(a,top);
			break;
		case 4:
			break;
		default:
			System.out.println("enter the correct number:");
			break;
				
		}
		}
	
	}
	
	
	public static int push(int a[],int top)
	{
		System.out.println("enter the element to push:-");
		if(top==a.length-1)
		{
			System.out.println("stack is full");
		}
		else
			
		{
			top=top+1;
			a[top]=sc.nextInt();
		}
		return top;

		
	}
	
	public static int  pop(int a[],int top)
	{
		if(top<=-1)
		{
			System.out.println("stack is empty");
		}
		System.out.println("deleted element is "+ a[top]);
		top--;
		return top;
	}
	
	public static void display(int a[],int top)
	{
		System.out.println("the elements of stack are:");
		for(int i=top; i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
