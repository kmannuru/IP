package linkedlist;

public class DoublyEndedList {
    Node head;
    Node tail;

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }

        if(this.tail != null){
            this.tail.setNextNode(newNode);
        }

        this.tail = newNode;
    }

    @Override
    public String toString(){
        String result = "{ ";
        Node currentNode = this.head;
        while(currentNode != null){
            result+=currentNode.toString();
            currentNode = currentNode.nextNode;
        }
        result+= " }";

        return result;
    }
}
