package stacks;

public class QueueArray {
    int head=-1,tail=-1;
    int MAX = 5;

    int[] arr = new int[MAX];

    public void enqueue(int n){
        if(head < 0){
            arr[++head] = n;
            ++tail;
        }else if(tail == MAX && head > 0){
            tail = 0;
            arr[tail] = n;
        }
    }
}
