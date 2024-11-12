class Solution {
    public int mySqrt(int x) {
        long left = 1;
        long right = x;
        if(x == 1){
            return 1;
        }
        while(left <= right){
            long middle = (left+ right)/2;
            if(middle* middle > x){
                right = middle -1;
            } else if(middle*middle < x){
                left = middle + 1;
            } else {
                return (int) middle;
            }
        }
        return (int)(left -1);
        }
    }

