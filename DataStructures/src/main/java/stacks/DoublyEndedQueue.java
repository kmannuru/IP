package stacks;

public class DoublyEndedQueue {
    Node head;
    
    public void enqueueAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }
    
    public void enqueueAtTail(int data){
        Node newNode = new Node(data);
        Node tailNode = getTailNode();
        tailNode.setNextNode(newNode);
    }
    
    public Node dequeueAtHead(){
        Node currentNode = this.head;
        this.head = currentNode.getNextNode();
        return currentNode;
    }
    
    public Node dequeueAtTail(){
        Node currentNode = this.head;
        while(currentNode.getNextNode().getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        
        Node next = currentNode.getNextNode();
        currentNode.setNextNode(null);
        return next;
        
    }
    
    public Node getTailNode(){
        Node currentNode = this.head;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }
}
