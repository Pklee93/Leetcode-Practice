package removeNthNode;

public class ListNode {
	private int val;
	private ListNode next;
	
	public ListNode() {
		
	}
	
	public ListNode(int val) {
		this.val = val;
	}
	
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public ListNode add(int val) {
		ListNode node = new ListNode(val);
		for (ListNode curr = next; curr != null; curr = curr.next) {
			if (curr.next == null) {
				curr.next = node;
				break;
			}
		}
		return this;
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode cur1 = head, cur2 = head;
		for (int i = 1; i <= n; i++) {
			cur2 = cur2.next;
		}
		while (cur2 != null) {
			if (cur2.next.next == null) {
				cur1.next = cur1.next.next;
				break;
			}
		}
		return this;
	}
	
	public String toString() {
		String str = "" + val;
		ListNode curr = next;
		while (curr != null) {
			str += curr.val + " ";
		}
		return str;
	}
}
