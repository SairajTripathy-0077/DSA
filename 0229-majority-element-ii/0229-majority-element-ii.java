class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        List<Integer> majorityElements = new ArrayList<>();
        int threshold = nums.length / 3;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > threshold) {
                majorityElements.add(element);
            }
        }
        return majorityElements; 
    }
    }
