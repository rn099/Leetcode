import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> newMap = new HashMap <Character, Integer > ();
        if(s.length() != t.length()){
            return false;
        }
        for (char c: s.toCharArray()){
            newMap.put(c, newMap.getOrDefault(c,0) + 1);
        }

        for (char c: t.toCharArray()){
            if(!newMap.containsKey(c)){
                return false;
            }
            newMap.put(c, newMap.get(c) - 1);

            if(newMap.get(c) == 0){
                newMap.remove(c);
            }
        }

        return newMap.isEmpty();
    }
}