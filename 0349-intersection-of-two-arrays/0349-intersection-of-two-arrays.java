class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        // Step 1: Add all elements of nums1 to the HashSet
        for(int i = 0; i < n1; i++){
            hs.add(nums1[i]);
        }
        
        // Step 2: Check elements of nums2 against the set
        for(int i = 0; i < n2; i++){
            // FIX: Check nums2[i] instead of nums1[i]
            if(hs.contains(nums2[i])){
                l1.add(nums2[i]);
                hs.remove(nums2[i]); // Remove to ensure unique elements in the result
            }
        }
        
        // FIX: Initialize the array here, now that we know the size of l1
        int[] arr = new int[l1.size()];
        int i = 0;

        // Step 3: Populate the result array
        for (int num : l1) {
            arr[i++] = num;
        }

        return arr;
    }
}