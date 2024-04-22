class A
{
    int p, q;
    void sum ()
    {
        System.out.println ("Sum is "+(p+q));
    }
}
class B
{
    public static void main (String s [])
    {
        A p; // The A. class is loaded, i.e., static variables are created
        A obj1=new A ();
        A obj2=new A ();
        A obj3=new A ();
    }
}

// output: Sum is 0
//         Sum is 0
//         Sum is 0
//         Sum is 0

