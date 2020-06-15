/*

Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head3 = null;
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null && l2!=null){
            return l2;
        }
        if(l1!=null && l2==null){
            return l1;
        }
        if(l1!=null && l2!=null){
            if(l1.val<l2.val){
                head3 = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                head3 = new ListNode(l2.val);
                l2= l2.next;
            }
            
        }
        System.out.println(head3.val);
        ListNode temp = head3;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                head3.next = new ListNode(l1.val);
                l1 = l1.next;
                
            }
            else{
                head3.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head3 = head3.next;
        }
        while(l1!=null){
            head3.next = new ListNode(l1.val);
            head3 = head3.next;
            l1 = l1.next;
        }
        while(l2!=null){
            head3.next = new ListNode(l2.val);
            head3 = head3.next;
            l2 = l2.next;
        }
        return temp;
    }
}
