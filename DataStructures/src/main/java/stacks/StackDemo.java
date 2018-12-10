package stacks;

public class StackDemo {

    public static void main(String []args){
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(20);
        System.out.println(s.peek());

        System.out.println("=====STACK ARRAY=====");
        StackArray arr = new StackArray(5);
        arr.push(5);
        arr.push(10);
        arr.push(15);
        System.out.println(arr.peek());
        System.out.println(arr.pop());
        System.out.println(arr.peek());
        arr.push(20);
        System.out.println(arr.peek());
    }
}
