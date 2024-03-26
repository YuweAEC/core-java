class Rect
{
	int l,b;
	void area()
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
	public static void main(String s[])
	{
		Rect r1=new Rect();
		Rect r2=new Rect();
		r1.area();
		r2.peri();
	}
}

