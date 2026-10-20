class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // The minimum must be strictly in the right half
                low = mid + 1;
            } else {
                // The minimum is at mid or in the left half
                high = mid;
            }
        }
        return nums[low];
    }
}