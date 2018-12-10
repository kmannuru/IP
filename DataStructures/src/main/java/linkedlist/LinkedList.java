package linkedlist;

public class LinkedList {

    private Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        this.head = newNode;
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

    public int length(){
        Node currentNode = head;
        int length = 0;
        while(currentNode != null){
            currentNode = currentNode.nextNode;
            length++;
        }
        return length;
    }

    public void deleteFromHead(){
        Node currentNode = this.head.nextNode;
        this.head = currentNode;
    }

    public void find(int data){
        Node currentNode = head;
        boolean found = false;
        while (currentNode != null){
            if(currentNode.data == data){
                System.out.println("Found item");
                found=true;
                break;
            }
            currentNode = currentNode.nextNode;

        }

        if(!found){
            System.out.println("item not found");
        }
    }
}
