class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // String newString = s.trim().toLowerCase();
        int left = 0; 
        int right = newString.length() - 1;
        
        while(left<right){
        if(newString == " "){
            return true;
        }
        if(newString.charAt(left) != newString.charAt(right)){
            return false;
        } else {
            left++;
            right--;
        }
        }
        return true;
        
    }
}