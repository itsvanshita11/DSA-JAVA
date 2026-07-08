public class bubbleSort {
    
    public static void BS(int arr[])
    {
        int n = arr.length;

        for(int turn=0;turn<=n-2;turn++)
        {
            for(int j=0;j<=n-2-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={5,4,3,2,1};
        BS(arr);
        printArr(arr);
    }
}
