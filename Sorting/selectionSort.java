public class selectionSort {
    
    public static void SS(int arr[]){
        
        int n = arr.length;

        for(int i=0;i<=(n-2);i++){ // calculate turns through this loop
            int minPos = i;

            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }

    public static void printArr(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int[] arr={2,1,3,4,6,5};
        
        SS(arr);
        printArr(arr);
    }
}
