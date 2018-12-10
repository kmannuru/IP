package linkedlist;

public class SortedLinkedListDemo {

    public static void main(String []args){
        SortedLinkedList sList = new SortedLinkedList();
        sList.insertElement(10);
        sList.insertElement(5);
        sList.insertElement(30);
        sList.insertElement(2);
        sList.insertElement(7);

        System.out.println(sList.toString());
    }
}
