import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        QuickSort x = new QuickSort();
        int size;
        int i;

        //get size of array
        System.out.print("Enter size of array: ");
        size = scnr.nextInt();
        int[] array = new int[size];

        //populate the array
        System.out.println("Populate the array: ");
        for(i = 0; i < size; i++){
            array[i] = scnr.nextInt();
        }

        //can quickSort method
        x.quickSort(array, 0, size - 1);

        //print array
        for(i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }

    }
}
