package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BubbleSort {
    
    public static void main(String []args){
        int[] arr = {453,23,5,23,6,1,7465};
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<arr.length;i++){
            set.add(Integer.valueOf(arr[i]));
        }
        System.out.println("Set : "+set.toString());
        
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
