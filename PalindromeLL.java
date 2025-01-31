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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrL=new ArrayList<>();
        ListNode temp=head;
        while(head!=null){
            arrL.add(head.val);
            head=head.next;
        }
        int i=0;
        int j=arrL.size()-1;
        while(i<j){
            if(arrL.get(i)!=arrL.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
