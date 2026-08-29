class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs = new HashSet<>();
        for(char ch: s.toCharArray()){
            if(hs.contains(ch)){
                return ch;
            }
            hs.add(ch);
        }
        return ' ';
    }
}