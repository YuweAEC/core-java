import java.util.Scanner;

class A
{
	private int x=46, y=53;
	void sum()
	{
		int s=x+y;
		System.out.println("The sum is "+s);
	}
	/*A(int i, int j)
	{
		x=i;
		y=j;
		System.out.println("Constructor Called");
	}*/
}

class ConstructorDemo
{
	public static void main(String s[])
	{
		/*Scanner p=new Scanner(System.in);
		System.out.print("Enter values for the 1st object ");
		int m=p.nextInt();
		int n=p.nextInt();*/
		A obj1=new A();
		//A obj2=new A(6,24);
		
		obj1.sum();
		//obj2.sum();
	}
}

// output: The sum is 99
//         The sum is 30
