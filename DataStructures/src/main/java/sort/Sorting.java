package sort;

import java.util.Arrays;

public class Sorting {

    public static void main(String []args){
        int[] arr = {2,6354,43,65,35,765};

        //insertion sort
        for(int i=1;i<arr.length;i++){
            int currentValue = arr[i];
            int j=i-1;
            while(j>=0){
                if(currentValue<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }else{
                    break;
                }
            }

            arr[j+1] = currentValue;
        }

        System.out.println("Insertion Sort : "+Arrays.toString(arr));

        //selection sort
        int[] arr1 = {2,6354,43,65,35,765};
        for(int i=0;i<arr1.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[minIndex]>arr1[j]){
                    minIndex=j;
                }
            }

            if(minIndex != i){
                int temp= arr1[i];
                arr1[i] = arr1[minIndex];
                arr1[minIndex] = temp;
            }
        }

        System.out.println("Selection Sort : "+Arrays.toString(arr1));


        //bubble sort
        int[] arr2 = {2,6354,43,65,35,765};
        for(int i=0;i<arr2.length;i++){
            for(int j=i;j<arr2.length-1;j++){
                if(arr2[j]>arr2[j+1]){
                    int temp= arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }

        System.out.println("Bubble Sorted : "+ Arrays.toString(arr));
    }
}
