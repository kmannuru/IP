package assignments.assignment4;

public class RotateElements {

    public static void main(String []args){
        LinkedList llist = new LinkedList();
        llist.insertAtHead(10);
        llist.insertAtHead(20);
        llist.insertAtHead(30);
        llist.insertAtHead(40);
        llist.insertAtHead(50);
        llist.insertAtHead(40);
        System.out.println("list :"+llist.toString());
        llist.removeDuplicates();
        System.out.println(llist.toString());
        System.out.println("Head : "+llist.head.toString());

        System.out.println("4th element is :"+llist.findElementFromEnd(4).toString());
        llist.reverseElements();
        System.out.println("After reversal : "+llist.toString());

        llist.rotateElements(4);
        System.out.println("After rotation : "+llist.toString());
    }
}
