class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums[0];

        while (left <= right) {
            // If subarray is already sorted
            if (nums[left] <= nums[right]) {
                ans = Math.min(ans, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;
            ans = Math.min(ans, nums[mid]);

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                // Right half is unsorted
                right = mid - 1;
            }
        }

        return ans;
    }
}
