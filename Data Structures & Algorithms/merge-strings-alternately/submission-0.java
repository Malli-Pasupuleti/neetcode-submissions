class Solution {
    public String mergeAlternately(String word1, String word2) {
        int st1 = word1.length();
        int st2 = word2.length();

        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(i < st1 && j < st2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        if(st1 > st2){
            for(int k = i; k < st1; k++){
                sb.append(word1.charAt(k));
            }
        }else{
            for(int k = j; k < st2; k++){
                sb.append(word2.charAt(k));
            }
        }
        return sb.toString();
    }
}