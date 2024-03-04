class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target, true);
        int right = search(nums, target, false);

        if (left <= right) {
            return new int[] { left, right };
        } else {
            return new int[] { -1, -1 };
        }
    }

    static int search(int[] nums, int target, boolean findleft) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findleft) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;

    }
}