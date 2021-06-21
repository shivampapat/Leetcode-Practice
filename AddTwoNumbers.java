public class AddTwoNumbers {
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
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          
          ListNode result = new ListNode();
          ListNode temp = result;
          int carry=0;
          while(l1.next != null && l2.next != null){
              temp.val  = carry + l1.val + l2.val;
              carry = temp.val/10;
              temp.val = temp.val%10;
              temp.next = new ListNode();
              temp = temp.next; 
              l1 = l1.next;
              l2 = l2.next;
          }
          
          temp.val = carry + l1.val + l2.val;
          carry = temp.val/10;
          temp.val = temp.val%10;
          l1 = l1.next;
          l2 = l2.next;
          
          
          while(l1 != null){
              temp.next = new ListNode();
              temp = temp.next; 
   
              temp.val = carry + l1.val;
              carry = temp.val/10;
              temp.val = temp.val%10;
              
              l1 = l1.next;
          }
          
          while(l2 != null){
              temp.next = new ListNode();
              temp = temp.next; 
   
              temp.val = carry + l2.val;
              carry = temp.val/10;
              temp.val = temp.val%10;
   
              l2 = l2.next;
          }
          
          
          if(carry >0){
              temp.next = new ListNode();
              temp = temp.next; 
              temp.val =carry;
              temp.next= null;
          }
   
          return result;
          
      }
  
}
