package binarySearch;

public class Solution {
	public int search(int[] nums, int target) {
		int head = 0;
		int tail = nums.length - 1;
		
		while (head <= tail) {
			int cur = head + (tail - head) / 2;
			if (nums[cur] == target) {
				return cur;
			}
			if (nums[cur] > target) {
				tail = cur - 1;
			} else {
				head = cur + 1;
			}
		}
		return -1;
	}

}
