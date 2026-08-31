class Solution {
    private int ans = 0;

    private void placeQueen(
        int n,
        boolean[] ld,
        boolean[] rd,
        boolean[] col,
        int row
    ) {
        if (row == n) {
            ans++;
            return;
        }

        for (int j = 0; j < n; j++) {
            int leftDiagonal = n - 1 + row - j;
            int rightDiagonal = row + j;

            if (col[j] || ld[leftDiagonal] || rd[rightDiagonal])
                continue;

            col[j] = true;
            ld[leftDiagonal] = true;
            rd[rightDiagonal] = true;

            placeQueen(n, ld, rd, col, row + 1);

            col[j] = false;
            ld[leftDiagonal] = false;
            rd[rightDiagonal] = false;
        }
    }

    public int totalNQueens(int n) {
        boolean[] ld = new boolean[2 * n - 1];
        boolean[] rd = new boolean[2 * n - 1];
        boolean[] col = new boolean[n];

        placeQueen(n, ld, rd, col, 0);

        return ans;
    }
}