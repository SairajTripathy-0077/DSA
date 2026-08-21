class Solution {
    public int pivotIndex(int[] nums) {
        int right = nums.length - 1;
        int total=0,rsum=0;
        int pivot = -1;
        for(int i=0;i<nums.length;i++){
            total = total + nums[i];
        }
        while(right>=0){
            total = total - nums[right];
            if(total == rsum){
                pivot = right; 
            }
            rsum = rsum + nums[right];
            right--;
        }
        return pivot;
    }
}