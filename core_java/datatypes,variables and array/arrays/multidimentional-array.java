// Demonstrate a two-dimensional array. 

class TwoDArray 
{ 
    public static void main(String[] args) 
    { 
        int[][] twoD= new int[4][5]; 
        int i, j, k = 0; 
        
        for(i=0; i<4; i++) 
        
        for(j=0; j<5; j++) 
        { 
            twoD[i][j] = k; 
            k++; 
        } 
        
        for(i=0; i<4; i++) 
        { 
            for(j=0; j<5; j++) 
            System.out.print(twoD[i][j] + " "); 
            
            System.out.println(); 
        } 
    } 
}

// output: 0 1 2 3 4
//         5 6 7 8 9

class TwoDAgain 
{ 
    public static void main(String[] args) 
    { 
        int[][] twoD = new int[4][]; 
        
        twoD[0] = new int[1]; 
        twoD[1] = new int[2]; 
        twoD[2] = new int[3]; 
        twoD[3] = new int[4]; 
        
        int i, j, k = 0; 
        
        for(i=0; i<4; i++) 
        
        for(j=0; j<i+1; j++) 
        { 
            twoD[i][j] = k; 
            k++;
        } 
        
        for(i=0; i<4; i++) 
        { 
            for(j=0; j<i+1; j++) 
            
            System.out.print(twoD[i][j] + " "); 
            System.out.println(); 
        } 
    } 
}

// output: 0

