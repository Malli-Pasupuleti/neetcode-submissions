class Solution {
    public void rotate(int[] nums, int k) {
        int n = k % nums.length;

        int i = 0;
        int j = nums.length - 1;
        while(i <= j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
        i = 0;
        j = n - 1;
        while(i <= j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
        i = n;
        j = nums.length - 1;
        while(i <= j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
        for(int m : nums){
            System.out.print(m);
        }
    }
}