package stacks;

public class Queue {
    Node head;

//    public void enqueue(int data){
//        Node newNode = new Node(data);
//        if(this.head == null){
//            this.head = newNode;
//        }else{
//            Node currentNode = this.head;
//            while(currentNode.getNextNode() != null){
//                currentNode = currentNode.getNextNode();
//            }
//            currentNode.setNextNode(newNode);
//        }
//    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }

    public Node peek(){
        Node currentNode = this.head;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public Node dequeue(){
        Node currentNode = this.head;
        if(currentNode == null){
            return null;
        }else if(currentNode.getNextNode() == null){
            this.head = null;
            return currentNode;

        }else{
            while(currentNode.getNextNode().getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            Node nextNode = currentNode.getNextNode();
            currentNode.setNextNode(null);
            return nextNode;
        }
    }
}
