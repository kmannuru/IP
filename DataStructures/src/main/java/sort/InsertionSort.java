package sort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args){
        int[] arr = {10,453,23,5,27,6,9,7465,1};
        
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int currentVal = arr[i];
            
            while(j>=0 && currentVal<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = currentVal;
        }

        System.out.println("Array = "+ Arrays.toString(arr));
    }
}
