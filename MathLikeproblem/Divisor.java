/*

Leetcode problem - 1390
Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0.

 

Example 1:

Input: nums = [21,4,7]
Output: 32
Explanation: 
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.
Example 2:

Input: nums = [21,21]
Output: 64
Example 3:

Input: nums = [1,2,3,4,5]
Output: 0
*/

class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSums=0;
        for(int n:nums){
            int count=0;
            int sum=0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    int d1=i;
                    int d2=n/i;
                    if(d1==d2){
                    count+=1;
                    sum+=d1;
                }
                else{
                    count+=2;
                    sum+=d1+d2;
                }
                if(count>4) break;
                }               
            }
            if(count==4) totalSums+=sum;
            
        }
        return totalSums;
    }
}
