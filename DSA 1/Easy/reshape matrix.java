class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c)return mat;
        int ans[] = new int[n*m];
        int k =0;
        int[][] newmat = new int[r][c];
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                ans[k] = mat[i][j];
                k++;
            }
        }
        //for(int i =0;i<k;i++) System.out.print(ans[i]+" ");
        k=0;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                newmat[i][j] = ans[k];
                k++;
            }
        }
        return newmat;
    }
}
