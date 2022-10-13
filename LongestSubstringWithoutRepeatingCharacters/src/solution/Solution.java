package solution;

import java.util.HashMap;

public class Solution {
//	public static int lengthOfLongestSubstring(String s) {
//		if (s.length()==0) return 0;
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int max=0;
//        for (int i=0, j=0; i<s.length(); ++i){
//            if (map.containsKey(s.charAt(i))){
//                j = Math.max(j,map.get(s.charAt(i))+1);
//            }
//            map.put(s.charAt(i),i);
//            max = Math.max(max,i-j+1);
//        }
//        return max;
//	}
	
	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0;
		for (int begin = 0, end = 0; end < s.length(); end++) {
			if (map.containsKey(s.charAt(end))) {
				begin = Math.max(begin, map.get(s.charAt(end)) + 1);
			}
			map.put(s.charAt(end), end);
			max = Math.max(max, end - begin + 1);
		}
		return max;
	}

	public static void main(String[] args) {
		String s = "abcabcbb";
//		String s = "bbbbbbbb";
//		String s = "pwwkew";
		System.out.println("Answer: " + lengthOfLongestSubstring(s));
	}
}
