package stacks;

public class QueueDemo {

    public static void main(String []args){

        Queue queue = new Queue();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
