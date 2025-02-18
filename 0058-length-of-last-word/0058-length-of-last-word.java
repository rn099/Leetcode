class Solution {
    public int lengthOfLastWord(String s) {
        String newString = s.trim();
        int length = 0;
        if(newString.length() == 1) return 1;
        for(int i=newString.length()-1; i>=0; i--){
            if(newString.charAt(i) != ' ' || i == 0){
                length++;
            } else {
                break;
            }
        }
        return length;
    }
}