//Problem Link:https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dum=new ListNode(-1);
        ListNode prev=dum;
        while (l1!=null || l2!=null) {
            int tmp=carry;
            if(l1!=null){ tmp+=l1.val;l1=l1.next;}
            if(l2!=null){ tmp+=l2.val;l2=l2.next;}
            carry=tmp/10;
            ListNode cur=new ListNode(tmp%10);
            prev.next=cur;
            prev=prev.next;
        }
        if(carry>0) {
            ListNode cur=new ListNode(carry);
            prev.next=cur;
            prev=prev.next;
        }
        return dum.next;
    }
}
