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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode l3 = new ListNode(0);
        ListNode head = l3 ;
    

    while(list1!= null && list2!=  null)
    {
        if(list1.val <= list2.val)
        {
            head.next= new ListNode(list1.val);
            list1 = list1.next;
        }
        else
        {
            head.next = new ListNode(list2.val);
            list2 = list2.next;
        }
        head = head.next;
    }

    while(list1!= null)
    {
        head.next = new ListNode(list1.val);
        head = head.next;
        list1 = list1.next;
    }

    while(list2!= null)
    {
        head.next = new ListNode(list2.val);
        head = head.next;
        list2 = list2.next;
    }
    return l3.next;
    }
}