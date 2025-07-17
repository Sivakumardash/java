package oops;
interface i1
{
	/*by default it is  public abstract */ void sounds();
}
class cat implements i1
{
	public void sounds()
	{
		System.out.println("meao");
	}
}

public class Interfacee {

	public static void main(String[] args)
	{
		i1 cat=new cat();
		cat.sounds();

	}

}
