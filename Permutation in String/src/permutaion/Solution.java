package permutaion;

import java.util.HashMap;

public class Solution {
	public static boolean checkInclusion(String s1, String s2) {
		for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
			if (s1.contains(s2.substring(i, i + 1))) {
				if (isPermutated(s1, s2.substring(i, i + s1.length()))) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean isPermutated(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		
		for (int i = 0; i < s2.length(); i++) {
			if (map.containsKey(s2.charAt(i))) {
				if (map.get(s2.charAt(i)) == 1) {
					map.remove(s2.charAt(i));
				} else {
					map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
				}
			} else {
				return false;
			}
		}
		if (map.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String s1 = "adc";
		String s2 = "dcda";
		
		System.out.println(checkInclusion(s1, s2));
	}

}
