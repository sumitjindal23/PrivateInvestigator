Let's define some parameters

n =  Total number of lines in a file

m =  Maximum size of any sentence

1. Time Complexity of algorithm = O(nm^2)
2. There are multiple way this problem can scale
    
    a. File size is too large 
    
    Sol - In this case we need to use map reduce algorithm to handle this case. MapReduce will use multiple threads to execute the code in parallel and then merge the final output.  

    b. Number of files are huge
    
    Sol - To solve this we can increase the number of servers and there is a load balance that will handle the loads and in each server we can solve using map reduce.
3. If I have 2 weeks time to solve this problem then I would have used map reduce and to handle multiple files in one server I would have used spark to handle the load.