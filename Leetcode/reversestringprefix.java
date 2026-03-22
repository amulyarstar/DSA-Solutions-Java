class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder rev= new StringBuilder();
        for (int i=k-1;i>=0;i--){
          rev.append(s.charAt(i));  
        }
        rev.append(s.substring(k));
        return rev.toString();
    }
}
