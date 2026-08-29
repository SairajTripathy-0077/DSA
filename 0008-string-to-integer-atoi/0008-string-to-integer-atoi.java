class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long x=0;
        int sign=1;
        int i=0;
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        for(char c: s.toCharArray()){
            if ((c == '-' || c == '+') && i == 0) {
                if (c == '-') sign = -1;
                i++;
                continue;
            }
            if (Character.isDigit(c)) {
                int digit = c - '0';
                x = x * 10 + digit;
                if (sign * x <= INT_MIN) {
                    return INT_MIN;
                }
                if (sign * x >= INT_MAX) {
                    return INT_MAX;
                }
            } 
            else{
                break;
            }  
            i++;
        }
        return (int)(x * sign);
    }
}