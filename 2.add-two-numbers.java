/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start

// public class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode d = l;
        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;
        while (p1 != null || p2 != null) {
            int sum = (p1 != null ? p1.val : 0) + (p2 != null ? p2.val : 0) + carry;

            carry = sum / 10;

            l.next = new ListNode(sum % 10);
            l = l.next;
            p1 = p1 != null ? p1.next : p1;
            p2 = p2 != null ? p2.next : p2;
        }

        l.next = carry != 0 ? new ListNode(carry) : null;

        return d.next;

    }
}
// @lc code=end
