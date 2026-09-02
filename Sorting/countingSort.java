public class countingSort {
    public static void CS(int arr[]){
        
        //1. first find largest element
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        // 2. create count array to calculate frequency of elements
        int[] count = new int[largest+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // 3. now sort/reconstruct the array using count array

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={4,2,2,8,3,3,1};

        CS(arr);
        printArr(arr);
    }
}
