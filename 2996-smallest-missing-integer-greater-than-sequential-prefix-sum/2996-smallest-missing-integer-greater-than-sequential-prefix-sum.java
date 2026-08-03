class Solution {
    public int missingInteger(int[] nums) {
        // STEP 1: Calculate the sequential prefix sum
        int sum = nums[0]; // Start with the first element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break; // Stop at the end of the sequential prefix
            }
        }
        
        // STEP 2: Find the smallest missing integer >= sum
        boolean found = true;
        
        // Keep looping as long as we find 'sum' inside the array
        while (found) {
            found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == sum) {
                    found = true;
                    sum++; // The sum exists, so increment and check again
                    break;
                }
            }
        }
        
        return sum;
    }
}