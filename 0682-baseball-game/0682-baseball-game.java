class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int ans = 0;
        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                ans -= stack.pop();
                continue;
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
            ans += stack.peek();
        }
        return ans;
    }
}