package middle;

public class ListNode {
	int val;
	ListNode next;
	
	public ListNode() {
		
	}
	
	public ListNode(int val) {
		this.val = val;
	}
	
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public ListNode middleNode(ListNode head) {
		int middle = length(head) / 2;
		ListNode ans = head;;
		for (int i = 0; i < middle; i++) {
			ans = ans.next;
		}
		return ans;
	}
	
	public int length(ListNode head) {
		int length = 0;
		if (head == null) {
			return length;
		}
		for (ListNode curr = head; curr != null; curr = curr.next) {
			length++;
		}
		return length;
	}
	
	public ListNode add(int val) {
		ListNode next = new ListNode(val);
		for (ListNode curr = this; curr != null; curr = curr.next) {
			if (curr.next == null) {
				curr.next = next;
				break;
			}
		}
		return this;
	}
	
	public String toString(ListNode head) {
		String str = "[";
		for (ListNode curr = head; curr != null; curr = curr.next) {
			str += curr.val + " ";
		}
		return str + "]";
	}
}
