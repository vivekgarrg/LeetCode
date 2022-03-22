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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = null;
        ListNode tempNode = null;
        ListNode temp = head;
        
        while(temp!=null){
            if(node==null){
                ListNode newNode = new ListNode(temp.val);
                node = newNode;
                tempNode = node;
            }else if(temp.val != tempNode.val){
                ListNode newNode = new ListNode(temp.val);
                tempNode.next = newNode;
                tempNode = tempNode.next;
            }
            temp = temp.next;
        }
        return node;
    }
}