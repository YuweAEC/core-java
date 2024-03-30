// Demonstrate lifetime of a variable. 

class LifeTime 
{ 
    public static void main(String[] args) 
    { 
        int x; 
        
        for(x = 0; x < 3; x++) 
        { 
            int y = -1; // y is initialized each time block is entered 
            System.out.println("y is: " + y); // this always prints -1 
            
            y = 100; 
            System.out.println("y is now: " + y); 
        } 
    } 
}

// output:  y is: -1
//          y is now: 100
//          y is: -1
//          y is now: 100
//          y is: -1

// In this program, y is initialized each time the block is entered. Thus, the output shows that y is always -1 when the block is entered. However, y is then set to 100 each time the block is entered. This is why the second println( ) statement always displays 100.

