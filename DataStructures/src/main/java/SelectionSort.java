import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args){
        int[] arr = {453,23,5,23,6,1,7465};
        
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                int temp= arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
        System.out.println("Array = "+ Arrays.toString(arr));
    }
}
