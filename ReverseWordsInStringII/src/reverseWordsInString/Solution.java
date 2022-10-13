package reverseWordsInString;

public class Solution {
	public static String reverseWords(String s) {
		char[] arr = s.toCharArray();
		for (int start = 0; start < arr.length; start++) {
			if (arr[start] != ' ') {
				int end = start;
				while (end + 1 < arr.length && arr[end + 1] != ' ') {
					end++;
				}
				flip(arr, start, end);
				start = end;
			}
		}
		return new String(arr);
	}
	
	private static void flip(char[] arr, int start, int end) {
		while(start < end) {
			char temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

}
