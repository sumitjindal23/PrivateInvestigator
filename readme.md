Let's define some parameters

n =  Total number of lines in a file

m =  Maximum size of any sentence

1. Time Complexity of algorithm = O(nm^2)
2. There are multiple dimensions along which this problem can be scaled. And there are 2 ways this scaling problem can be solved. MapReduce with Spark (100x faster than MapReduce)
    
    a. File size is too large 
    
    Sol -  In this case we need to use map reduce algorithm. MapReduce will use multiple threads to execute the code in parallel and then merge the final output using reducers.  

    b. Number of files are huge
    
    Sol - To solve this case, we can horizontally scale the service and put load balancer on top of it. Then at each server we can solve the problem for each file using map reduce.
3. If I have 2 weeks time to solve this problem then I would have set up spark environment to handle any number of files of any size.