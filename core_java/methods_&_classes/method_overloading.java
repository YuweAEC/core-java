//Program on Method overloading
class Addition
{
	void sum(int x, int y)
	{
		int s=x+y;
		System.out.println("With 2 int");
		System.out.println("The sum is "+s);
	}
	void sum(int p,double q)
	{
		double s=p+q;
		System.out.println("With int & double");
		System.out.println("The sum is "+s);
	}
	void sum(double p,int q)
	{
		double s=p+q;
		System.out.println("With double & int");
		System.out.println("The sum is "+s);
	}
	void sum(double x,double y,double z)
	{    
		double s=x+y+z;
		System.out.println("With 3 double");
		System.out.println("The sum is "+s);
	}
	void prod(int a, int b)
	{
	}
}

class MethodOverloading
{
	public static void main(String s[])
	{
		Addition a1=new Addition();
		a1.sum(5.8, 8.1, 10.6); 
		System.out.println();
		a1.sum(12.5, 18);
		System.out.println();
		a1.sum(16, 39);
		System.out.println();
		a1.sum(10, 2.5);
	}
}

class OverloadMain
{
	public static void main(String s)
	{
		System.out.println("main() with String parameter");
	}
	public static void main(int s[])
	{
		System.out.println("main() with int type array");
	}
	public static void main(String s, int p)
	{
		System.out.println("main() with String and int type parameter");
	}
	/*public static void main(String s[])
	{
		System.out.println("STARTING POINT of EXECUTION");
		main("Asansol",713305);
		main(23.59);
		main("India");
	}*/
	public static void main(double b)
	{
		System.out.println("main() with double type parameter");
	}
}

