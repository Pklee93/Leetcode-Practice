package addTwoNumbers;

public class Test extends Solution{

	public static void main(String[] args) {
		ListNode test1 = new ListNode(9);
//		test1.next = new ListNode(4);
//		test1.next.next = new ListNode(3);
		
		ListNode test2 = new ListNode(1);
		for (int i = 0; i < 8; i++) {
			ListNode adding = new ListNode(9, null);
			for (ListNode node = test2; node != null; node = node.next) {
				if(node.next == null) {
					node.next = adding;
					break;
				}
			}
		}
		
		ListNode result = addTwoNumbers(test1, test2);
		for(ListNode node = result; node != null; node = node.next) {
			System.out.println(node.val);
		}
	}

}
