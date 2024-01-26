public class QuickSort {

    public void quickSort(int[] arr, int low, int high){
        if(low < high){
            //find pivot index
            int pivotIndex = partition(arr, low, high);

            //recursively call quickSort again using pivot index

            //for left side of array
            quickSort(arr, low, pivotIndex -1);
            //for right side
            quickSort(arr, pivotIndex + 1, high);

        }
    }
    static int partition(int[] arr, int low, int high){
        //set the pivot value to value at high
        int pivot = arr[high];

        //set index to low position
        int i = low -1;

        //iterate through array from given low and high
        for(int j = low; j < high; j++){

            //if index is less than the pivot value swap with lower value
            if(arr[j] < pivot){
                //increment index to that smaller element
                i++;
                swap(arr, i, j);
            }
           /* for(int k = 0; k < arr.length; k++){ // print out each time
                System.out.print(arr[k] + " ");
            }
            System.out.println(" ");*/
        }
        //swap index value with high value
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int position1, int position2){
        int temp = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = temp;
    }
}
