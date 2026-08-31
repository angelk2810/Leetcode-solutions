class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        int srow = 0;
        int scol = 0;
        int erow = matrix.length - 1;
        int ecol = matrix[0].length - 1;
        while (srow <= erow && scol <= ecol) {
            for (int j = scol; j <= ecol; j++) {
                res.add(matrix[srow][j]);
            }
            for (int i = srow + 1; i <= erow; i++) {
                res.add(matrix[i][ecol]);
            }
            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow) {
                    break;
                }
                res.add(matrix[erow][j]);
            }
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) {
                    break;
                }
                res.add(matrix[i][scol]);
            }
            scol++;
            srow++;
            ecol--;
            erow--;
        }
        return res;
    }
}