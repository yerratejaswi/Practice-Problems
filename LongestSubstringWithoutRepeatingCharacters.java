//Problem Link:https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(),res=0;
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0,j=0;j<n;j++){
            if(m.containsKey(s.charAt(j))) i=Math.max(i,m.get(s.charAt(j)));
            res=Math.max(res,j-i+1);
            m.put(s.charAt(j),j+1);
        }
        return res;
    }
}
