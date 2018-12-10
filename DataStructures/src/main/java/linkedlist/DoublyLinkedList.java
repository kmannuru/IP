package linkedlist;

public class DoublyLinkedList {

    Node head;

    public void insertElement(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }else{
            Node currentNode = this.head;

            while (currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            newNode.setPrevNode(currentNode);
            currentNode.setNextNode(newNode);
        }

    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }else{
            this.head.setPrevNode(newNode);
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }

    @Override
    public String toString(){
        String data = "{ ";
        Node currentNode = head;
        while(currentNode != null){
            data+= currentNode.toString() + " , ";
            currentNode = currentNode.nextNode;
        }
        return data + "}";
    }
}
