public class bubbleSort{
    public static void BS(int arr[]){
        int n = arr.length;

        for(int turn=0;turn<=n-2;turn++){
            for(int i=0;i<=(n-2-turn);i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args){
        int[] arr={5,4,1,3,2};

        BS(arr);
        printArr(arr);
    }


}