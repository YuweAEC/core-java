if(i == 10) 
{ 
    if(j < 20) a = b; 
    if(k > 100) c = d; // this if is 
    else a = c; // associated with this else 
} 
else a = d; // this else refers to if(i == 10

// output: a = b
//         a = c
//         a = d

