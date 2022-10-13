package twoSumII;

public class Solution {
	public static int[] twoSum(int[] numbers, int target) {
		int[] ans = new int[2];
		int head = 0, tail = numbers.length - 1;
		while (head < tail) {
			int temp = target - numbers[head];
			while (temp <= numbers[tail]) {
				if (temp == numbers[tail]) {
					ans[0] = head + 1;
					ans[1] = tail + 1;
					return ans;
				}
				tail--;
			}
			head++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[] {-1, 0};
		int target = -1;
		int[] ans = twoSum(numbers, target);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
