package assignments.assignment4;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void rotateElements(int number){
        for(int i=0;i<number;i++){
            Node currentNode = this.head;
            Node prevNode = null;
            while(currentNode.getNextNode() != null){
                prevNode = currentNode;
                currentNode = currentNode.getNextNode();
            }
            prevNode.setNextNode(null);
            currentNode.setNextNode(this.head);
            this.head = currentNode;
        }
    }

    public int length(){
        int count = 0;
        Node currentNode = this.head;
        while(currentNode != null){
            currentNode = currentNode.getNextNode();
            count++;
        }
        return count;
    }

    public void reverseElements(){
        Node currentNode = this.head;
        Node next;
        while(currentNode.getNextNode() != null){
            next = currentNode.getNextNode();
            currentNode.setNextNode(next.getNextNode());
            next.setNextNode(this.head);
            this.head = next;

        }
    }
    
    public boolean isCircular(){
        Node currentNode = this.head;
        Node slow,fast;
        while(true){
            slow = currentNode.nextNode;
            if(slow == null){
                return false;
            }
            fast = currentNode.getNextNode().getNextNode();
            if(fast == null){
                return false;
            }
            if(slow == fast || fast.getNextNode() == slow){
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
    }

    public Node findElementFromEnd(int number){
        Node currentNode = this.head;
        for(int i=0;i<(length()-number);i++){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public void deleteNode(Node node){
        if(node.getNextNode() != null){
            node.setData(node.nextNode.getData());
            node.setNextNode(node.getNextNode().getNextNode());
        }
    }

    public void removeDuplicates(){
        Set elements = new HashSet<Integer>();
        Node currentNode = this.head;
        elements.add(currentNode.getData());
        while(currentNode.getNextNode() != null){
            if(elements.contains(currentNode.getNextNode().getData())){
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
            }else{
                elements.add(currentNode.getNextNode().getData());
                currentNode = currentNode.getNextNode();
            }
        }
    }

    @Override
    public String toString(){
        String result = "{";
        Node currentNode = this.head;
        while (currentNode != null){
            result+= currentNode.toString();
            currentNode = currentNode.getNextNode();
        }
        result+= " }";
        return result;
    }
}
