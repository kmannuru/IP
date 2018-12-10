package stacks;

public class StackArray {
    int[] arr;
    int top = -1;
    int MAX = 0;
    public StackArray(int size){
        this.arr = new int[size];
        this.MAX = size;
    }

    public void push(int n){
        if(top >= MAX){
            System.out.println("Out of limit");
        }else{
            top++;
            this.arr[top] = n;
        }
    }

    public int peek(){
        return arr[top];
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }else{
            int x = arr[top];
            top--;
            return x;
        }
    }
}
