// Demonstrate casts. 

class Conversion 
{ 
    public static void main(String[] args) 
    { 
        byte b; 
        int i = 257; 
        double d = 323.142; 
        System.out.println("\nConversion of int to byte."); 
        
        b = (byte) i; 
        System.out.println("i and b " + i + " " + b); 
        System.out.println("\nConversion of double to int."); 
        
        i = (int) d; 
        System.out.println("d and i " + d + " " + i); 
        System.out.println("\nConversion of double to byte."); 
        
        b = (byte) d; 
        System.out.println("d and b " + d + " " + b); 
    } 
}

// output:  Conversion of int to byte.
//          i and b 257 1

//          Conversion of double to int.
//          d and i 323.142 323

//          Conversion of double to byte.
//          d and b 323.142 67

// In this program, the integer value 257 is assigned to i. When i is cast to a byte, the value is reduced modulo 256, which results in the value 1. When the double value 323.142 is cast to an int, the fractional part is lost, resulting in the value 323. When the double value 323.142 is cast to a byte, the fractional part is lost and the value is reduced modulo 256, resulting in the value 67.

