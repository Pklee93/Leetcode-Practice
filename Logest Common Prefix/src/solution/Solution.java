package solution;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
		String[] strs = {"a"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			int len = 2;
			while (len <= strs[i].length()) {
				for (int j = 0; j <= strs[i].length() - len; j++) {
					String temp = strs[i].substring(j, j + len);
					if (map.containsKey(temp)) {
						map.put(temp, map.get(temp) + 1);
					} else {
						map.put(temp, 1);
					}
				}
				len++;
			}
		}
		String ans = "";
		for (String s : map.keySet()) {
			if (map.get(s) == strs.length) {
				if (ans.equals("")) {
					ans = s;
				} else if (ans.length() < s.length()) {
					ans = s;
				}
			}
		}
		return ans;
	}

}
