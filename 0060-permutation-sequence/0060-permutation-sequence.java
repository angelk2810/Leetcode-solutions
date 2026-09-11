class Solution {
    public String getPermutation(int n, int k) {
        java.util.List<Integer> nums = new java.util.ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }
        k--;
        StringBuilder ans = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            int blockSize = fact[i - 1];
            int index = k / blockSize;
            ans.append(nums.get(index));
            nums.remove(index);
            k %= blockSize;
        }
        return ans.toString();
    }
}