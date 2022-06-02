/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

package addTwoNumbers;

public class Solution {
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode result = new ListNode();
		boolean start = false;
		while (l1 != null || l2 != null) {
			int value;
			if (l1 == null) {
				value = l2.val;
			} else if (l2 == null) {
				value = l1.val;
			} else {
				value = l1.val + l2.val;
			}
			if (value >= 10) {
				if (!start) {
					result = new ListNode(value % 10, null);
					start = true;
				} else {
					for (ListNode node = result; node != null; node = node.next) {
						if (node.next == null) {
							node.next = new ListNode(value % 10, null);
							break;
						}
					}
				}
				if (l1 != null) {
					l1 = l1.next;
				}
				if (l2 != null) {
					l2 = l2.next;
				}
				if(l1 == null && l2 == null) {
					for (ListNode node = result; node != null; node = node.next) {
						if (node.next == null) {
							node.next = new ListNode(1, null);
							break;
						}
					}
				} else if (l1 == null) {
					l2.val += 1;
				} else {
					l1.val += 1;
				}
			} else {
				if (!start) {
					result = new ListNode(value, null);
					start = true;
				} else {
					for (ListNode node = result; node != null; node = node.next) {
						if (node.next == null) {
							node.next = new ListNode(value, null);
							break;
						}
					}
				}
				if (l1 != null) {
					l1 = l1.next;
				}
				if (l2 != null) {
					l2 = l2.next;
				}
			}
		}
		return result;
    }

}
