class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int dp[][]= new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(n-1,m-1,obstacleGrid,dp);
    }
    private int solve(int i,int j,int[][]obstacleGrid,int[][]dp){
        if(obstacleGrid[0][0]==1) return 0;
        if(i==0 && j==0) return 1;
        if(i<0 ||j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(obstacleGrid[i][j]==1) return 0;
        int up=solve(i-1,j,obstacleGrid,dp);
        int left=solve(i,j-1,obstacleGrid,dp);
        dp[i][j]=up+left;
        return dp[i][j];
    }
}