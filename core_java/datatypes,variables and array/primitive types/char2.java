// char variables behave like integers

class CharDemo2 
{ 
    public static void main(String[] args) 
    { 
        char ch1; 
        ch1 = X; 
        System.out.println("ch1 contains " + ch1); 
        ch1++; // increment ch1 
        System.out.println("ch1 is now " + ch1); 
    } 
}

// output:  ch1 contains X
//           ch1 is now Y

// In this program, a char variable is declared and initialized with the character X. The value of ch1 is then displayed. Next, ch1 is incremented. When the program is run, the output is ch1 contains X ch1 is now Y. This program demonstrates that char variables can be used in arithmetic expressions. In this case, ch1 is incremented by one. The result is the character Y, which is displayed by the second println( ) statement.
