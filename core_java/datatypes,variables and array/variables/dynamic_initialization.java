// Demonstrate dynamic initialization. 

class DynInit 
{ 
    public static void main(String[] args) 
    { 
        double a = 3.0, b = 4.0; 
        // c is dynamically initialized 
        double c = Math.sqrt(a * a + b * b); 
        System.out.println("Hypotenuse is " + c); 
    } 
}

// output:  Hypotenuse is 5.0
// In this program, the variables a and b are initialized to 3.0 and 4.0, respectively. The variable c is then dynamically initialized to the square root of the sum of the squares of a and b. The result is displayed, which is 5.0.

