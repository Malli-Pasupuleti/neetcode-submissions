class Solution {
    public void reverse(int[] nums, int i, int j){
        while(i <= j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
      }
    public void rotate(int[] nums, int k) {
        int n = k % nums.length;
        // reverse all
        reverse(nums, 0, nums.length - 1);
        // reverse upto k
        reverse(nums, 0, n - 1);

        reverse(nums, n, nums.length - 1);

        for(int m : nums){
            System.out.print(m);
        }
    }
}