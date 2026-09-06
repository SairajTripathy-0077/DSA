class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String ch : tokens){
            if(ch.equals("+")){
                int c1 = (int)stk.pop();
                int c2 = (int)stk.pop();
                stk.push(c1 + c2);
            }
            else if(ch.equals("-")){
                int c1 = (int)stk.pop();
                int c2 = (int)stk.pop();
                stk.push(c2 - c1);
            }
            else if(ch.equals("*")){
                int c1 = (int)stk.pop();
                int c2 = (int)stk.pop();
                stk.push(c1 * c2);
            }
            else if(ch.equals("/")){
                int c1 = (int)stk.pop();
                int c2 = (int)stk.pop();
                stk.push(c2 / c1);
            }else{
                stk.push(Integer.parseInt(ch));
            }
        }
        return stk.pop();
    }
}