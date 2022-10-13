package searchInsertPosition;

public class Solution {
	public static int searchInsert(int[] nums, int target) {
		int head = 0, tail = nums.length - 1;
		while (head < tail) {
			int cur = head + (tail - head) / 2;
			if (nums[cur] == target) {
				return cur;
			} else if (nums[cur] < target) {
				head = cur + 1;
			} else {
				tail = cur;
			}
		}
		if (nums[tail] >= target) {
			return tail;
		} else {
			return tail + 1;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1};
		int target = 1;
		System.out.println(searchInsert(arr, target));
	}

}
