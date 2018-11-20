package search;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //search
        int prevIndex=0;
        int max = arr.length-1;
        int currentIndex = (prevIndex+max)/2;
        int searchValue = 5;

        while (arr[currentIndex] != searchValue){
            prevIndex = currentIndex;
            currentIndex = (prevIndex+max)/2;
            if(prevIndex == currentIndex){
                break;
            }

        }

    }
}
