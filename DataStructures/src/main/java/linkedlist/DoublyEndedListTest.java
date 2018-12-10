package linkedlist;

public class DoublyEndedListTest {

    public static void main(String []args){

        DoublyEndedList dList = new DoublyEndedList();
        dList.insertAtTail(10);
        dList.insertAtTail(20);
        dList.insertAtTail(30);
        dList.insertAtTail(40);
        System.out.println(dList.toString());
    }

}
