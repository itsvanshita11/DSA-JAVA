public class checkSortedArray {
    
    public static boolean checkSorted(int[] arr){

        for(int i=1;i<arr.length;i++){

            if(arr[i-1]<=arr[i]){

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={90,80,100,70,50};

        if(checkSorted(arr)){
            System.out.println("Array is sorted");
        }

        else{
            System.out.println("Array is not sorted");
        }



    }
}
