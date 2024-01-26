public class Sort {

    public void insert(int[] x, int size){
        int i;
        int j;
        int temp;

        //move through array
        for(i = 1; i < size; i++){
            j = i-1; //since first element was considered sorted
            temp = x[i];
            //swap the value of temp with each element that is less than it
            while( j >= 0 && (temp <= x[j])){
                swap(x, j, j+1, temp);
                j--;

            }

        }
    }
    public void swap(int[] x, int index1, int index2, int temp){
        x[index2] = x[index1];
        x[index2 - 1] = temp;
    }
}
