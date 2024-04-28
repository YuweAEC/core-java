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
