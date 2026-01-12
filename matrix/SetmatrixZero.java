/*
  Leetcode problem -73
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows=new boolean[matrix.length];
        boolean[] coloumns = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    coloumns[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(rows[i] || coloumns[j]){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
