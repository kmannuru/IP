package search;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,8,9};

        //search
        int searchNumber = 2;
        int min=0, max= arr.length-1;
        int mid = min+((max-min)/2);

        while(mid != min && arr[mid] != searchNumber){
            if(arr[mid] > searchNumber){
                max = mid;
            }else {
                min = mid;
            }
            mid = min+(max-min)/2;
        }

        if(arr[mid] == searchNumber){
            System.out.println("Number "+searchNumber+" found at index :"+mid);
        }else{
            System.out.println("Number not found");
        }

    }
}
