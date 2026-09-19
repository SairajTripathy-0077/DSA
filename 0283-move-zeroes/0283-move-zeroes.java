class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int x : nums) {
            if (x != 0) {
                nums[index] = x;
                index++;
            }
        }

        // Step 2: Fill the rest with zeroes
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}