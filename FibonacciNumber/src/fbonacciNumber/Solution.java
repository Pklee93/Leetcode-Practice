package fbonacciNumber;

import java.util.ArrayList;

public class Solution {
//	public static int fib(int n) {
//		if (n <= 1 && n >= 0) {
//			return n;
//		}
//		int a = 0, b = 1;
//		for (int i = 2; i <= n; i++) {
//			int sum = a + b;
//			a = b;
//			b = sum;
//		}
//		return b;
//	}
	
//	public static int fib(int n) {
//		if (n <= 1) {
//			return n;
//		}
//		return fib(n-1) + fib(n-2);
//	}
	private static int[] fibArr = new int[50];
	public static int fib(int n) {
		fibArr[0] = 0;
		fibArr[1] = 1;
		for (int i = 2; i < fibArr.length; i++) {
			fibArr[i] = fibArr[i-1] + fibArr[i-2];
		}
		return fibArr[n];
	}
	
	public static void main(String[] args) {
		System.out.println(fib(46));
	}

}
