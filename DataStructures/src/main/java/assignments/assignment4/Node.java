package assignments.assignment4;

public class Node {
    int data;
    Node nextNode;

    public Node(int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return " \n Data : "+this.data;
    }


}
