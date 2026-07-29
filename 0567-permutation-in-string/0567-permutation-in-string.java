class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] charInS1 = new int[26];
        int len1, len2;
        len1 = s1.length();
        len2 = s2.length();

        //s1 cannot have greater length than s2
        if(len1 > len2) return false;

        calculateFreq(s1, charInS1);
        int[] charsInS2 = new int[26];
        calculateFreq(s2.substring(0, len1), charsInS2);

        if(eqalFreq(charsInS2,charInS1)){
            return true;
        } 
        for(int i = len1; i<len2; i++){
            char charBeforeStartOfWindow = s2.charAt(i-len1);
            char charAtEndOfWindow = s2.charAt(i);

            //decrement frequency of the last seen element before the start of the window
            charsInS2[charBeforeStartOfWindow - 'a']--;
            charsInS2[charAtEndOfWindow - 'a']++;

            if(eqalFreq(charInS1, charsInS2)){
                return true;
            }
        }
        return false;

    }
    private void calculateFreq(String s, int[] chars){
        for(char ch: s.toCharArray()){
            chars[ch-'a']++;
        }
    }
    private boolean eqalFreq(int[] chars1, int[] chars2){
        for(int i = 0; i<26; i++){
            if(chars1[i] != chars2[i]){
                return false;
            }
        }
        return true;
    }
}