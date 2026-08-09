import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int stop = m + n;
        int[] sum = new int[stop];
        int i=0;
        while(i< m){
            sum[i] = nums1[i];
            i++;
        }
        int j= 0;
        while(j<n){
            sum[i] = nums2[j];
            j++;
            i++;
        }
        Arrays.sort(sum);
        if(stop%2 != 0){
            return sum[((m+n)/2)];
        }else{
            double avg = (double)(sum[((m+n)/2)] + sum[((m+n)/2)-1])/2;
            return (avg);
        }
    }
}