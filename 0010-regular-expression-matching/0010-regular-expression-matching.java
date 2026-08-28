class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        Boolean[][] dp = new Boolean[n+1][m+1];
        return helper(0, 0, s, p, dp);
    }

    private boolean helper(int i, int j, String s, String p, Boolean[][] dp){
        if(i==s.length() && j==p.length()) return true;
        if(i<s.length() && j==p.length()) return false;

        if(dp[i][j] != null) return dp[i][j];

        boolean ans = false;
        if(j+1 < p.length() && p.charAt(j+1) == '*'){
            boolean matched = i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
            ans = helper(i, j+2, s, p, dp) || (matched && helper(i+1, j, s, p, dp));
        }
        else if(i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')){
            ans = helper(i+1, j+1, s, p, dp);
        }

        return dp[i][j] = ans;
    }
}