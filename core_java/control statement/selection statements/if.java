
boolean dataAvailable; 
//... 
if (dataAvailable) 
    ProcessData(); 
else 
    waitForMoreData();



int bytesAvailable; 
    // ... 
if (bytesAvailable > 0) 
{ 
    ProcessData(); 
    bytesAvailable -= n; 
} 
else 
    waitForMoreData()



int bytesAvailable; 
// ... 
if (bytesAvailable > 0) 
{ 
    ProcessData(); 
    bytesAvailable -= n; 
} 
else 
    waitForMoreData(); 
    bytesAvailable = n;


    
int bytesAvailable; 
// ... 
if (bytesAvailable > 0) 
{ 
    ProcessData(); 
    bytesAvailable -= n; 
} 
else 
{ 
    waitForMoreData(); 
    bytesAvailable = n; 
}

