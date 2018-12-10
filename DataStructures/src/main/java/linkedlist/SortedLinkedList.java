package linkedlist;

public class SortedLinkedList {
    Node head;

    public void insertElement(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }else{
            Node currentNode = this.head;
            Node prevNode = null;
            if(newNode.getData() < currentNode.getData()){
                newNode.setNextNode(this.head);
                this.head = newNode;
            }else{
                while(currentNode != null && newNode.getData() > currentNode.getData()){
                    prevNode = currentNode;
                    currentNode = currentNode.getNextNode();
                }
                prevNode.setNextNode(newNode);
                newNode.setNextNode(currentNode);
            }
        }
    }

    @Override
    public String toString(){
        String result = "{ ";
        Node currentNode = this.head;
        while(currentNode != null){
            result += currentNode.toString();
            currentNode = currentNode.getNextNode();
        }
        result+= " }";
        return result;
    }
}
