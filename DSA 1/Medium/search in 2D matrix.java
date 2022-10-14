class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;
        if(target > matrix[row-1][cols-1])return false;
        int r = -1;
        for(int i=0;i<row;i++){
            if(target == matrix[i][cols-1]) return true;
            if(target < matrix[i][cols-1]){ 
                r=i;
                
                break;
            }
        }
        
        int[] arr = new int[cols];
        for(int j =0;j<cols;j++){
            arr[j] = matrix[r][j];
        }
        return binarySearch(arr,0,cols-1,target);
        
    }
    public boolean binarySearch(int[] arr,int low,int high,int target){
        if (low > high)
               return false;
   
        else{
               int mid = (low + high) / 2; 
               if (target == arr[mid]) return true;
           
       
               else if (target > arr[mid])        // x is on the right side
                   return binarySearch(arr,mid + 1,high,target);
               
               else                        // x is on the left side
                   return binarySearch(arr,low, mid - 1,target);
        }        
    }
}
