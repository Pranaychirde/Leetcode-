class Solution {
    public int fib(int n) {
       
       // base case
    if(n<=1){
        return n;
    }

    int last  =  fib(n-1);
    int slast = fib(n-2);
    int num  = last +slast;
    return last + slast;        
    }
}