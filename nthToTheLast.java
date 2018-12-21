import java.util.*;

public class nthToTheLast {

  public static void main (String[] args) {
    int[] theValues = {1,2,3,4,5,6,7,8,9,10};
    int n = 3; //target
    int length  = 10;
    //create the linked list of values
    Node head = createLinkedList(length);
    // System.out.println("Printing returned head's value: " + head.value);
    int nthToLastValue = getNthToLast(head, n);
    System.out.println("The nth to last value is: " + nthToLastValue);




  } //end of main

  private static class Node {
    private int value;
    private Node next;
  }

  public static Node createLinkedList(int length){
    Node head = null;
    Node currNode = null;
    for (int i = 0; i < length; i++){

      if (head == null){
        Node temp = new Node();
        temp.value = i+1;
        head = temp;
        currNode = head;
      }
      else {
        Node temp = new Node();
        temp.value = i+1;
        // System.out.println("temp value: " + temp.value);
        currNode.next = temp;
        currNode = currNode.next;
      }

    }
    return head;
  }

  public static int getNthToLast(Node node, int n){
    Node curr = node;
    Node follower = node;

    for (int i = 0; i < n; i++) {
      if (curr == null) return -1;
      curr = curr.next;
    }
    while (curr.next != null){
      curr = curr.next;
      follower = follower.next;
    }
    return follower.value;
  }


}
