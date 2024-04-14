switch(count) 
{ 
    case 1: 
    switch(target) { // nested switch 
   case 0:
    System.out.println("target is zero"); 
    break; 
    case 1: // no conflicts with outer switch 
    System.out.println("target is one"); 
    break; 
   }
    break;
    case 2:
    System.out.println("count is two");
    break;
    default:
    System.out.println("count is three or more");
}

