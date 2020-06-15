/*

Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:
Input: 1->1->2
Output: 1->2
Example 2:
Input: 1->1->2->3->3
Output: 1->2->3

*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int i=1;
        if(head==null){
            return null;
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(head!=null){
            if(!a.contains(head.val)){
                a.add(head.val);
            }
            head= head.next;
        }
        ListNode head1 = new ListNode(a.get(0));
        ListNode temp = head1;
        while(i<a.size()){
            head1.next = new ListNode(a.get(i));
            head1 = head1.next;
            i++;
        }
        return temp;
    }
}

//Another method
public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}
