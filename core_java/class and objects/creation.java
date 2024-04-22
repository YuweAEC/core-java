class Rect
{
    int l, b;
    void area ()
{

void perimeter ()
{
    
    
}

class Addition
{
    void sum (int x, int y)
    {
        int s=x + y;
        System.out.println ("The sum is "+s);
    }
    
    void sum (int x, double y)
    {
        double s=x + y;
        System.out.println ("The sum is "+s);
    }
    
    void sum (double x, int y)
    {
        double s=x + y;
        System.out.println ("The sum is "+s);
    }
    
    int sum (int x, int y, int z)
    {
        int s=x + y + z;
        return s;
    }
}

class OverloadMethod
{
    public static void main (String s[])
    {
        int p;
        Addition a1=new Addition ();
        p=a1. sum (10,20,30); 
        
        System.out.println ("The sum is "+p);
        
        a1.sum (12.5, 18); 
        a1.sum (16, 39); 
        a1.sum (10, 2.5); 
    }
}