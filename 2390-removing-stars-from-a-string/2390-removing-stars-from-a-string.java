class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder output = new StringBuilder();
        for(Character c: s.toCharArray()){
            if(c != '*'){
                st.push(c);
                // st = st.concat(c);
                // output = output + c;
            } else {
                st.pop();
            }
        
        }
        for(Character c: st){
            output.append(c);
        }

        return output.toString();
    }
}