class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int max = hm.values().stream().max(Integer::compare).get();
        int resultCount = 0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue() == max){
                resultCount+=max;
            }
        }
        return resultCount;
    }
}