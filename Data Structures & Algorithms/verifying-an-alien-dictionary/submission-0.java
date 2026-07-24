class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int rank[] = new int[26];

        for (int i = 0; i < 26; i++){
            rank[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++){
            if(!inOrder(words[i], words[i + 1], rank)){
                return false;
            }
        }

        return true;
    }

    public static boolean inOrder(String s1, String s2, int[] rank){
        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 != c2){
                return rank[c1 - 'a'] < rank[c2 - 'a'];
            }
        }

        return s1.length() <= s2.length();
    }
}