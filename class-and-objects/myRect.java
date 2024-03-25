class MyRect
{
	int l,b;
	private void area()
	{
		int a;
		a=l*b;
		System.out.println("Area is "+a);
	}
	void peri()
	{
		int p=2*(l+b);
		System.out.println("Perimeter is "+p);
	}
}

class MyRectDemo
{
	public static void main(String s[])
	{
		MyRect r1=new MyRect();
		MyRect r2=new MyRect();
		r1.area();
		r2.peri();
	}
}
