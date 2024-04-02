// Demonstrate boolean values. 
class BoolTest 
{ 
    public static void main(String[] args) 
    { 
        boolean b; 
        b = false; 
        
        System.out.println("b is " + b); 
        b = true; 
        
        System.out.println("b is " + b); 
        
        // a boolean value can control the if statement 
        
        if(b) System.out.println("This is executed."); 
        b = false; 
        
        if(b) System.out.println("This is not executed.");
        
        // outcome of a relational operator is a boolean value 
        
        System.out.println("10 > 9 is " + (10 > 9)); 
    } 
}

// output:  b is false
//          b is true
//          This is executed.
//          10 > 9 is true

// In this program, a boolean variable called b is declared and initialized to false. The value of b is then displayed. Next, b is set to true and displayed. The value of b is then used to control an if statement. The if statement is executed because b is true. Next, b is set to false and used to control another if statement. This time, the if statement is not executed because b is false. Finally, the outcome of the relational expression 10 > 9 is displayed. This expression evaluates to true, so the output is 10 > 9 is true.

