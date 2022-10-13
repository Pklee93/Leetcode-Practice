package reverseString;

public class Solution {
	public static void reverseString(char[] s) {
		int head = 0, tail = s.length - 1;
		while(head < tail) {
			char temp = s[tail];
			s[tail] = s[head];
			s[head] = temp;
			head++;
			tail--;
		}
	}
	
	public static void main(String[] args) {
		char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		for(char c : s) {
			System.out.print(c);
		}
	}

}
