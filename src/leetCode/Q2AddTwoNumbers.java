
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
package leetCode;
import leetCode.ListNode;
public class Q2AddTwoNumbers {

	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0 ;
    ListNode prev = new ListNode(0);
    ListNode head = prev;
    while(l1!=null||l2!=null||carry!=0){
        int number = ((l1 == null ? 0: l1.val)+(l2==null ? 0:l2.val)+carry);
        int qoutient = number%10;
        carry = number/10;
        ListNode current = new ListNode(qoutient);
        prev.next = current;
        prev = current;
        
        l1 = (l1 == null) ? l1:l1.next;
        l2 = (l2 == null) ? l2:l2.next;
    }
    return head.next;
    }
}
