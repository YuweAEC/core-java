// Declare a loop control variable inside the for. 
/*class ForTick 
{ 
    public static void main(String[] args) 
    { 
        // here, n is declared inside of the for loop 
        for(int n=10; n>0; n--) 
        System.out.println("tick " + n); 
    } 
}
*/

class Sample 
{ 
    public static void main(String[] args) 
    { 
        int a, b; 
        b = 4; 
        
        for(a=1; a<b; a++) 
        { 
            System.out.println("a = " + a); 
            System.out.println("b = " + b); 
            b--; 
        } 
    } 
}

// Using the comma. 
class Comma 
{ 
    public static void main(String[] args) 
    { 
        int a, b; 
        
        for(a=1, b=4; a<b; a++, b--) 
        { 
            System.out.println("a = " + a); 
            System.out.println("b = " + b); 
        } 
    } 
}

