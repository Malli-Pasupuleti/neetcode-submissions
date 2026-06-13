class Solution {
    public int mySqrt(int x) {
        int i = 0;
        int j = x;

        int ans = 0;
        while(i <= j){
            int mid = i + (j - i) / 2;
            long sq = (long) mid * mid;
            if(sq == x){
                return mid;
            }else if(sq <= x){
                ans = mid;
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return ans;
    }
}