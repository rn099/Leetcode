class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Pointer = m-1;
        int num2Pointer = n-1;
        int arrayPointer = m+n-1;
        while(num2Pointer >=0){
            if(num1Pointer >=0 && nums1[num1Pointer] > nums2[num2Pointer]){
                nums1[arrayPointer] = nums1[num1Pointer];
                num1Pointer--;
            } else{
                nums1[arrayPointer] = nums2[num2Pointer];
                num2Pointer--;
            }
            arrayPointer--;
        }
    }
}
