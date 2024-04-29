package operators;

class Division
{
	public static void main(String s[])
	{
		//System.out.println(12/0);
		System.out.println(12/0.0);
		System.out.println(-12/0.0);
		System.out.println(0.0/0.0);//NaN
		System.out.println((0.0/0.0) == (0.0/0.0));
	}
}
