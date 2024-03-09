import java.util.Arrays;

class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for (int d[] : dp) {
            Arrays.fill(d, -1);
        }
        return solveMem(k, n, target, dp);
    }

    public int solveMem(int m, int n, int x, int[][] dp) {
        // base case
        if (x < 0)
            return 0;
        if (n == 0 && x != 0) {
            return 0;
        }
        if (n != 0 && x == 0)
            return 0;
        if (n == 0 && x == 0)
            return 1;
        if (dp[n][x] != -1)
            return dp[n][x];
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            ans = (ans + solveMem(m, n - 1, x - i, dp)) % 1000000007;
        }
        return dp[n][x] = ans;

    }
}