class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        // words = [dog, cat,cat,dog]
        // pattern = "abba"
        if(words.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        for(int i=0; i<words.length; i++){ //4
        char c = pattern.charAt(i);
        String word = words[i];
        //check char exists in map
            //check word mapped with character
        //else char doesnt exist
            //check if word exists in map
            //else add map and reverse map
        
        
            if(map.containsKey(c)){
                if(!map.get(c).equals(word)){
                    return false;
                }
            } else {
            if(reverseMap.containsKey(word)){
                return false;
            }
            map.put(c, word);
            reverseMap.put(word, c);
            }
        }
        return true;
    }
}