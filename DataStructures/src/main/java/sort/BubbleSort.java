package sort;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String []args){
        int[] arr = {453,23,5,23,6,1,7465};
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.println("Array = "+ Arrays.toString(arr));
    }
}
