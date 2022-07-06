class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        int max = Integer.MIN_VALUE;
        
        for(int r = 0 ; r < m ; r++)
            for(int c = 0 ; c < n ; c++)
                if(!visited[r][c])
                    max = Math.max(max , maxGold(grid , m , n , r, c , visited));
        
        return Math.max(0,max);
    }
    
    public int maxGold(int[][] grid , int m , int n , int r , int c , boolean[][] visited){
        if(r<0 || c<0 || r>=m || c>=n || grid[r][c] == 0 || visited[r][c])
            return Integer.MIN_VALUE;
        
        visited[r][c] = true;
        //Move to above row and same column
        int p1 = maxGold(grid , m , n , r-1 , c , visited);
        
        //Move to below row and same column
        int p2 = maxGold(grid , m , n , r+1 , c , visited);
        
        //Move to left column
        int p3 = maxGold(grid , m , n , r , c-1 , visited);
        
        //Move to right column
        int p4 = maxGold(grid , m , n , r , c+1 , visited);
        visited[r][c] = false;
        
        return grid[r][c] + Math.max(0 , Math.max(p1 , Math.max(p2 , Math.max(p3,p4))));
    }
}