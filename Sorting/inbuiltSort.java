import java.util.*;


public class inbuiltSort{

    public static void printArr(Integer arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr= {5,4,1,3,2};

        // in-built sort functions
        // Arrays.sort(arr);

        // with indices
        // Arrays.sort(arr,1,5);

        // in reverse order
        // Arrays.sort(arr,Collections.reverseOrder());

        // with indices
        Arrays.sort(arr,1,4,Collections.reverseOrder());

        printArr(arr);
    }
}