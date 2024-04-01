class Promote 
{ 
    public static void main(String[] args) 
    { 
        byte b = 42; 
        char c = a; 
        short s = 1024; 
        int i = 50000; 
        float f = 5.67f; 
        double d = .1234; 
        double result = (f * b) + (i / c) - (d * s); 
        
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s)); 
        System.out.println("result = " + result); 
    } 
}

// output:  238.14 + 198 - 126.3616
//          result = 309.7784

// In this program, the byte value 42 is multiplied by the float value 5.67. The result is added to the int value 50000 divided by the char value a. The result is then subtracted from the double value .1234 multiplied by the short value 1024. The result is displayed, which is 309.7784.

