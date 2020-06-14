/*

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

*/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
       // ListNode q = head.next;
        while(head!=null && head.val == val){
            head = head.next;
        }
        ListNode prev = head;
        while(head!=null){
            if( head.next!=null &&  head.next.val == val ){
                head.next = head.next.next;
            }
            else{
            head = head.next;
            }
        }
        
        return prev;
    }
}
