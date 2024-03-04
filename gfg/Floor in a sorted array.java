class Solution {

    static int findFloor(long arr[], int n, long x) {
        return find(arr, 0, n - 1, x, -1);

    }

    static int find(long[] arr, int start, int end, long x, int ans) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x) {
                ans = mid;
                return find(arr, mid + 1, end, x, ans);
            } else {
                return find(arr, start, mid - 1, x, ans);
            }

        }
        return ans;
    }

}
