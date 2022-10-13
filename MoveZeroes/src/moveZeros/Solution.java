package moveZeros;

public class Solution {
	public static void moveZeroes(int[] nums) {
		int numOfZero = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				numOfZero++;
			} else if (numOfZero > 0) {
				int temp = nums[i];
				nums[i] = 0;
				nums[i - numOfZero] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {0, 1, 0, 3, 12};
		moveZeroes(nums);
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}

}
