class Room
{
	int l,b,h;	//Instance Variables
	void vol()
	{
		int v=l*b*h;
		System.out.println("The volume is "+v);
	}
	Room(int x,int y,int z)
	{
		System.out.println("Constructor with 3 int");
		l=x;b=y;h=z;
	}
	Room(int x)
	{
		System.out.println("Constructor with 1 int");
		l=b=h=x;
	}
	Room(Room r)
	{
		System.out.println("Constructor with 1 Room type object");
		l=r.l;b=r.b;h=r.h;
	}
}

class ConstructorOverload
{
	public static void main(String s[])
	{
		Room r1=new Room(5,8,10);
		Room r2=new Room(5);
		Room r3=new Room(r1);
		Room r4=r2;
		r3.l=6;
		r4.l=10;
		System.out.print("Volume of r1: ");r1.vol();//400
		System.out.print("Volume of r2: ");r2.vol();//125
		System.out.print("Volume of r3: ");r3.vol();//480
		System.out.print("Volume of r4: ");r4.vol();//125   1000   250
	}
}

