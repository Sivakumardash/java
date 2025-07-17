package ll.dsa;

import java.util.Scanner;
class node
{
  int info;
  node next;
}
public class linkedlist {
	static Scanner sc=new Scanner(System.in);
	
	public static node create()
	{
		node p=new node();
		System.out.println("enter the element:");
		p.info= sc.nextInt();
		p.next=null;
		node start=p;
		node q=p;
		System.out.println("went to create more node?");
        sc.nextLine();
		String x=sc.nextLine();
		while(!x.isEmpty()&&x.charAt(0)=='y')
		{
			 p=new node();
			System.out.println("enter the element:");
			 p.info=sc.nextInt();
			 sc.nextLine();           // Clears the leftover Enter key
			 p.next=null;
			 q.next=p;
			 q=p;
			System.out.println("went to create more node?");
			 x=sc.nextLine();

		}
		return start;
	}
	
	public static  node insertbeg(node start)
	{
		System.out.println("enter the element to insert at beg:");
		node p=new node();
		p.info=sc.nextInt();
		p.next=start;
		start=p;
		return start;
	}
	
	public static  node insertend(node start)
	{
		node p=new node();
		System.out.println("enter the last no to be inserted:");
		p.info=sc.nextInt();
		node q=start;
		while(q.next!=null)
		{
			q=q.next;
		}
		q.next=p;
		return start;
	}
	public static node inspos(node start)
	{
		node p=new node();
		System.out.println("enter the element:-");
		p.info=sc.nextInt();
		System.out.println("enter the position to insert:-");
		int pos=sc.nextInt();
		node q=start;
		int count=1;
		while(count!=pos-1)
		{
			q=q.next;
			count++;
			
		}
		p.next=q.next;
		q.next=p;
		
		return start;
	}

	public static void display(node start)
	{
		System.out.println("the elements of the linkled list are :");
		node p=start;
		while(p!=null)
		{
			System.out.println(p.info);
			p=p.next;
		}
	}
	
	public static node delbeg(node start)
	{
		
		System.out.println("the deleted element is:" + start.info);
		node p=start;
		p=p.next;
		start=p;
		
		return start;
		
	}
	
	
	public static node delend(node start)
	{
		node p=start;
		while(p.next.next!=null)
		{
			p=p.next;
		}
		p.next=null;
		
		return start;
	}


	
	
	public static void main(String[] args) 
	{
		node start=null;

		while (true)
		{
		
		System.out.println("press 1 to create");
		System.out.println("press 2 to insert at beginning");
		System.out.println("press 3 to insert at end");
		System.out.println("press 4 to insert at any position");
		System.out.println("press 5  to delete element at beginning");
		System.out.println("press 6 to delete the end element");
		System.out.println("press 7 to display");
		System.out.println("press 8 to exit");
		
		System.out.println("enter your choise:-");
		int x=sc.nextInt();
		sc.nextLine(); 
		switch(x)
		{
		case 1:
			 start=create();
			break;
		case 2:
			start=insertbeg(start);
			break;
		case 3:
			start= insertend(start);
			break;
		case 4:
			start=inspos(start);
			break;
		case 5:
			start=delbeg(start);
			break;
		case 6:
			start=delend(start);
			break;
		case 7:
			display(start);
			break;
		case 8:
			return;
			
			
		
		}
		
		}

	}

}
