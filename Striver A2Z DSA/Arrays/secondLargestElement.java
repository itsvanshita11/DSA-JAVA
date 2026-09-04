import java.util.*;

public class secondLargestElement {

    public static int brute(int arr[]){ // Time-complexity: O(N log N) + O(N)

        Arrays.sort(arr);

        int n = arr.length;
        int largest=arr[n-1];

        int secondLargest=-1;

        for(int i=arr[n-2];i>=0;i--){
            if(arr[i]!=largest){
                secondLargest=arr[i];
            }
        }

        return secondLargest;
    }

    public static int better(int arr[]){ // Time-complexity: O(N+N) = O(2N)
        int largest = arr[0];

        // 1. find largest element in array

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }

        // now with the help of largest element find second largest element in array

        int secondLargest=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }

        return secondLargest;
    }


    public static int optimal(int arr[]){ //Time-complexity: O(N)

        // find second largest element with the help of largest element in array

        int largest=arr[0];
        int secondLargest=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }

            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        
        int[] arr= {1,2,4,7,7,5};   
        // int secondLargest = brute(arr);
        int secondLargest = optimal(arr);

        System.out.println("Second-largest: "+ secondLargest);
    }
    
}
