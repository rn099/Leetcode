class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i] == 0){
                int x = nums[i];
                nums[i] = nums[j];
                nums[j] = x;
            }
            
            if(nums[i] == 0){ 
                j++; 
            } else {
                i++; j++;
            }
        }
    }
}