class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //optimized approach(space)
        int n = cost.length;
        
        int a = cost[0];
        int b = cost[1];
        
        for(int i = 2; i < n; i++){
            int sum = cost[i] + Math.min(a, b);
            a = b;
            b = sum;
        }
        return Math.min(a, b);
    }
}
