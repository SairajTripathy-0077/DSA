class Solution{
        public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+", "-", "*", "/" -> {
                    int c1 = stk.pop();
                    int c2 = stk.pop();
                    stk.push(switch (token) {
                        case "+" -> c2 + c1;
                        case "-" -> c2 - c1;
                        case "*" -> c2 * c1;
                        default  -> c2 / c1; 
                    });
                }
                default -> stk.push(Integer.parseInt(token));
            }
        }
        return stk.pop();
    }
}
