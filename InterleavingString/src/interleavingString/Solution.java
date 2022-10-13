package interleavingString;

import java.util.ArrayList;

public class Solution {
	public static boolean isInterleave(String s1, String s2, String s3) {
		if (s1.length() + s2.length() != s3.length()) {
			return false;
		}
		boolean[] s1index = new boolean[s1.length()];
		boolean[] s2index = new boolean[s2.length()];
		for (int i = 0; i < s3.length(); i++) {
			boolean found = false;
			String c3 = s3.substring(i,i + 1);
			for (int j = 0; j < s1.length(); j++) {
				if (s1index[j] == false && s1.subSequence(j, j + 1).equals(c3)) {
					s1index[j] = true;
					found = true;
					break;
				}
			}
			if (found == false) {
				for (int j = 0; j < s2.length(); j++) {
					if (s2index[j] == false && s2.subSequence(j, j + 1).equals(c3)) {
						s2index[j] = true;
						found = true;
						break;
					}
				}
			}
			
			if (found == false) {
				return false;
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1index[i] == false) {
				return false;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (s2index[i] == false) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isInterleave("aabcc", "dbbca", "aadbbbaccc"));
		
	}
	
//	public boolean isInterleave(String s1, String s2, String s3) {
//	    char[] c1 = s1.toCharArray(), c2 = s2.toCharArray(), c3 = s3.toCharArray();
//		int m = s1.length(), n = s2.length();
//		if(m + n != s3.length()) return false;
//		return dfs(c1, c2, c3, 0, 0, 0, new boolean[m + 1][n + 1]);
//	}
//
//	public boolean dfs(char[] c1, char[] c2, char[] c3, int i, int j, int k, boolean[][] invalid) {
//		if(invalid[i][j]) return false;
//		if(k == c3.length) return true;
//		boolean valid = 
//		    i < c1.length && c1[i] == c3[k] && dfs(c1, c2, c3, i + 1, j, k + 1, invalid) || 
//	        j < c2.length && c2[j] == c3[k] && dfs(c1, c2, c3, i, j + 1, k + 1, invalid);
//		if(!valid) invalid[i][j] = true;
//	    return valid;
//	}

}