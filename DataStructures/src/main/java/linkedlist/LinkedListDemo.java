package linkedlist;

public class LinkedListDemo {

    public static void main(String []args){
        LinkedList llist = new LinkedList();
        llist.insertAtHead(5);
        llist.insertAtHead(15);
        llist.insertAtHead(55);
        llist.insertAtHead(57);
        llist.insertAtHead(59);

        System.out.println(llist.toString());

        System.out.println("Length of linkedlist : "+llist.length());
        llist.deleteFromHead();
        System.out.println("New head data : "+llist.length());

        llist.find(55);
        llist.find(89);
    }
}
