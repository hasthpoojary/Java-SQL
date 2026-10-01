class Solution {
    public int numRookCaptures(char[][] board) {
        int r = 0, c = 0;
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (board[i][j] == 'R') {
                    r = i;
                    c = j;
                }
        int count = 0;
        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] x : d) {
            int i = r + x[0], j = c + x[1];
            while (i >= 0 && i < 8 && j >= 0 && j < 8) {
                if (board[i][j] == 'B')
                    break;
                if (board[i][j] == 'p') {
                    count++;
                    break;
                }
                i += x[0];
                j += x[1];
            }
        }
        return count;
    }
}