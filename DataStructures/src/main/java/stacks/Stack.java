package stacks;

public class Stack {
    Node head;

    public Node push(int data){
        Node currentNode = new Node(data);
        currentNode.setNextNode(this.head);
        this.head = currentNode;
        return this.head;
    }

    public Node pop(){
        if(this.head != null){
            Node currentNode = this.head;
            this.head = currentNode.getNextNode();
            return currentNode;
        }
        return null;
    }

    public Node peek(){
        return this.head;
    }
}
