class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<ast.length;i++){
            boolean shouldPush = true;
            while(!stk.isEmpty()){
                int peek = stk.peek();
                if(peek>0 && peek == ast[i]*-1){
                    stk.pop();
                    shouldPush = false;
                    break;
                }else if(peek == ast[i] || peek*ast[i]>0|| peek<0&&ast[i]>0){
                    break;
                }
                else if(Math.abs(peek)>Math.abs(ast[i])){
                    shouldPush = false;
                    break;
                }
                else if(Math.abs(peek)<Math.abs(ast[i])){
                    stk.pop();
                }
            }
            if(shouldPush){
                 stk.push(ast[i]);
            }
        }

        int[] res = new int[stk.size()];
        int j =0;
        for(int i: stk){
            res[j++]=i;
        }
        return res;
    }
}