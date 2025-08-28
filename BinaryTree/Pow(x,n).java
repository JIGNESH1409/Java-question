/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
*/
class Solution {
    public double myPow(double x, int n) {
    long pow= (long) n;

        if(pow<1){
            pow=pow*-1;            
        }
        double ans=recursivepow(x,pow);

        if(n<0){
            ans=1.0/ans;
        }   
        return ans;

    }
    public double recursivepow(double x ,long n){
        if(n==0){
            return 1.0;
        }
        double half=recursivepow(x,n/2);

        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }



    }
}
