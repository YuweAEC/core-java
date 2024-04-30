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
