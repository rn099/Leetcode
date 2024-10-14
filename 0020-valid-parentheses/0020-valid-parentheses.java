class Solution {
    public boolean isValid(String s) {
        Stack <Character> myStack = new Stack<Character> ();
        for(char c: s.toCharArray()){
            if(c == '('){
                myStack.push(')');
            } else if (c == '{'){
                myStack.push('}');
            } else if(c== '['){
                myStack.push(']');
            } else {
                if(myStack.empty() || myStack.pop() != c){
                    return false;
                }
            }
        }
        return myStack.empty();
    }
}