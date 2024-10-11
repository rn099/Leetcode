import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> newSet = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(newSet.contains(nums[i])){
                return true;
            } else {
                newSet.add(nums[i]);
            }
        }
        return false;
    }
}