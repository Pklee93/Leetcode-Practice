package middle;

public class Solution {
	
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		for (int i = 2; i < 7; i++) {
			node.add(i);
		}
		
		for (ListNode curr = node; curr != null; curr = curr.next) {
			System.out.println(curr.val);
		}
		
		System.out.println(node.middleNode(node).toString(node.middleNode(node)));
	}

}
