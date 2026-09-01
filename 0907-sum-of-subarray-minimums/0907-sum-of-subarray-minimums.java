import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        // Using Deque as a Stack is generally preferred in Java for performance, 
        // but java.util.Stack is perfectly fine here.
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        // 1. Find Previous Less Element (Strictly less to handle duplicates)
        for (int i = 0; i < n; i++) {
            while (!s1.isEmpty() && arr[s1.peek()] >= arr[i]) {
                s1.pop();
            }
            left[i] = s1.isEmpty() ? -1 : s1.peek();
            s1.push(i);
        }
        
        // 2. Find Next Less or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!s2.isEmpty() && arr[s2.peek()] > arr[i]) {
                s2.pop();
            }
            right[i] = s2.isEmpty() ? n : s2.peek();
            s2.push(i);
        }
        
        // 3. Calculate total contribution of each element
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            long leftCount = i - left[i];
            long rightCount = right[i] - i;
            
            // Calculate subarrays where arr[i] is the minimum
            long subarraysWithArrIAsMin = (leftCount * rightCount) % MOD;
            
            long contribution = (subarraysWithArrIAsMin * arr[i]) % MOD;
            totalSum = (totalSum + contribution) % MOD;
        }
        
        return (int) totalSum;
    }
}