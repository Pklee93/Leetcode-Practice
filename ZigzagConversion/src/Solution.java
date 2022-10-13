import java.util.ArrayList;

public class Solution {
	public static String convert(String s, int numRows) {
		char[] c = s.toCharArray();
		int len = c.length;
		StringBuffer[] zigzag = new StringBuffer[numRows];
		for (int i = 0; i < zigzag.length; i++) {
			zigzag[i] = new StringBuffer();
		}
		
		int i = 0;
		while (i < len) {
			for (int idx = 0; idx < numRows && i < len; idx++) {
				zigzag[idx].append(c[i++]);
			}
			for (int idx = numRows - 2; idx >= 1 && i < len; idx--) {
				zigzag[idx].append(c[i++]);
			}
		}
		for (int idx = 1; idx < zigzag.length; idx++) {
			zigzag[0].append(zigzag[idx]);
		}
		return zigzag[0].toString();
	}
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 4));
	}
}
