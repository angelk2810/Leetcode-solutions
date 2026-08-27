class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int a = m;
        int b = n;
        for (int[] ar : ops) {
            a = Math.min(a, ar[0]);
            b = Math.min(b, ar[1]);
        }
        return a * b;
    }
}