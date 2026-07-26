class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int end=matrix.length;
        for(int i=0;i<end;i++){
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target){
                
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]==target){
                        return true;
                    }
                }
                return false;

            }
            
        }
        return false;
    }
}
