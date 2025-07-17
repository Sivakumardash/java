package oops;

abstract class vehicle // if the class have abstract method then the class must be declared abstracted
{
	abstract void window(); 
	abstract void doors();  // abstract method should not have body
	void light()
	{
		System.out.println("no of lights :2");
	}
	
}
 
class car extends vehicle
{
	
	void window()
	{
		System.out.println("no of windows:4");
	}
	void doors()
	{
		System.out.println("no of doors:2");
	}
}

public class abstraction {

	public static void main(String[] args)
	{
		vehicle v1=new car();
		v1.window();
		v1.doors();
		v1.light();

	}

}
