class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs = new HashSet<String>();
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                if(board[i][j] != '.'){
                    if(!hs.add("rows"+i+board[i][j]) || !hs.add("cols"+j+board[i][j]) || 
                       !hs.add("box"+((i/3)*3+(j/3))+board[i][j])) return false;
                }
                
            }
        }
        return true;
        
    }
}
