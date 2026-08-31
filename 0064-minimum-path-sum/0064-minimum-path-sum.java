class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int [m][n];
        if (m==0 || n==0) return 0;
        dp[0][0]=grid[0][0];
        for(int col=1;col<n;col++) {
            dp[0][col]=dp[0][col-1]+grid[0][col];
        }
        for(int row=1;row<m;row++) {
            dp[row][0]=dp[row-1][0]+grid[row][0];
        }     
        rec(1,m,n,grid);
        return dp[m-1][n-1];
    }
    void rec(int row, int m, int n, int[][] grid) {
        if (row==m) return;
        for(int col=1;col<n;col++) {
            dp[row][col]=Math.min(dp[row-1][col], dp[row][col-1])+grid[row][col];
        }
        rec(row+1,m,n,grid);
    }
}