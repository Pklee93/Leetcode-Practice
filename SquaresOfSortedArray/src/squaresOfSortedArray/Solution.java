package squaresOfSortedArray;

public class Solution {
	public static int[] sortedSquares(int[] nums) {
		int start = 0, end = nums.length - 1;
		int[] answer = new int[nums.length];
		int pointer = nums.length - 1;
		
		while(pointer >= 0) {
			if (Math.abs(nums[start]) < Math.abs(nums[end])) {
				answer[pointer--] = nums[end] * nums[end];
				end--;
			} else {
				answer[pointer--] = nums[start] * nums[start];
				start++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {-4, -1, 0, 3, 10};
		int[] sortedArr = sortedSquares(arr);
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i] + ", ");
		}
	}

}
