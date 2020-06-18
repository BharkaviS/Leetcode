/*

Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
You may not modify the values in the list's nodes, only nodes itself may be changed.

Example 1:

Given 1->2->3->4, reorder it to 1->4->2->3.
Example 2:

Given 1->2->3->4->5, reorder it to 1->5->2->4->3.

*/

class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int left=1,right=arr.size()-1;
        while(left<=right){
            head.next = new ListNode(arr.get(right));
            head = head.next;
            if(left<right){
            head.next = new ListNode(arr.get(left));
            head = head.next;
            }
            left++;
            right--;
        }
        
    }
}
