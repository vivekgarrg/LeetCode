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
        
        ListNode root = null;
        ListNode temp = null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;

        while(temp1!=null && temp2!=null){
           int sum = carry + temp1.val + temp2.val;
            int ans = (sum%10);
            carry = sum/10;
            if(root ==null){
                root = new ListNode(ans);
                temp = root;
            }else{
                temp.next = new ListNode(ans);
                temp = temp.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1!=null){
            int sum = carry + temp1.val;
            int ans = (sum%10);
            carry = sum/10;
            if(root==null){
                root = new ListNode(ans);
                temp = root;
            }else{
                temp.next = new ListNode(ans);
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
          while(temp2!=null){
            int sum = carry + temp2.val;
            int ans = (sum%10);
            carry = sum/10;
            if(root==null){
                root = new ListNode(ans);
                temp = root;
            }else{
                temp.next = new ListNode(ans);
                temp = temp.next;
            }
              temp2= temp2.next;
        }
        
        if(carry != 0){
            if(root==null){
                root = new ListNode(carry);
                temp = root;
            }else{
                temp.next = new ListNode(carry);
            }
        }
        return root;
        
    }
}