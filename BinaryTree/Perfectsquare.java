/*
Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

 

Example 1:

Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
*/

class Solution {
    public int numSquares(int n) {
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q =new LinkedList<>();
        q.add(n);

        int c=0;

        visited[n]=true;
        while(!q.isEmpty()){
            c++;
            int size=q.size();

            for(int i=0;i<size;i++){
                int curr=q.remove();

                for(int j=1;j*j<=curr;j++){
                    int nxt=curr-(j*j);

                    if(nxt==0){
                        return c;
                    }

                    if(visited[nxt]==false){
                        visited[nxt]=true;
                        q.add(nxt);
                    }

                }
            }


        

        }
        return c;
    }
}
