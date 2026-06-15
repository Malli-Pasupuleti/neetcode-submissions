class Solution {
    public boolean isHappy(int n) {
       Set<Integer> hs = new HashSet<>();

       while(n != 1 && !hs.contains(n)){
            hs.add(n);
            n = getSum(n);
       } 
       return n == 1;
    }
    public static int getSum(int n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
