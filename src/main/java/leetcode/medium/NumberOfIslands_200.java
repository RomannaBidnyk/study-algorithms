package leetcode.medium;

public class NumberOfIslands_200 {

    /**
     * #1 DFS recursion
     * Time: O(R∗C) (nested for loop + dfd = O(R∗C) + O(R∗C))
     * Space: O(R∗C) (visited array + call stack in dfs = O(R∗C) + O(R∗C))
     * r - number of rows, c - number of columns
     */

    public int numIslands(char[][] grid) {
        int rN = grid.length, cN = grid[0].length;
        boolean[][] visited = new boolean[rN][cN];
        int countIslands = 0;
        for (int r = 0; r < rN; r++) {
            for (int c = 0; c < cN; c++) {
                if (!visited[r][c] && grid[r][c] == '1') {
                    dfs(grid, r, c, visited);
                    countIslands++;
                }
            }
        }
        return countIslands;
    }

    private void dfs(char[][] grid, int r, int c, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[r].length || grid[r][c] != '1' || visited[r][c]) return;
        visited[r][c] = true;
        dfs(grid, r + 1, c, visited);
        dfs(grid, r - 1, c, visited);
        dfs(grid, r, c + 1, visited);
        dfs(grid, r, c - 1, visited);
    }
}
