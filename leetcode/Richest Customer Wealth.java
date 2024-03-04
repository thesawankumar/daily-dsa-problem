class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int element : ints) {
                sum += element;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}