class Solution {

    public int numIslands(char[][] grid) {

        int count = 0;

        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == '1')
                {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }


    static void dfs(char[][] grid, int i, int j)
    {
        // boundary check
        if(i < 0 || j < 0 || 
           i >= grid.length || j >= grid[0].length ||
           grid[i][j] == '0')
        {
            return;
        }


        // mark visited
        grid[i][j] = '0';


        // move in 4 directions

        dfs(grid, i+1, j); // down
        dfs(grid, i-1, j); // up
        dfs(grid, i, j+1); // right
        dfs(grid, i, j-1); // left
    }
}