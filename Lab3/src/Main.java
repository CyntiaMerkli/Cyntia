import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Sort x = new Sort();
        int range;
        System.out.print("Enter size of array: ");
        range = scnr.nextInt();
        int[] array = new int[range];
        int i;

        //populate the array
        System.out.println("Populate the array: ");
        for (i = 0; i < range; i++){
            array[i] = scnr.nextInt();
        }
        //call insertion method
        x.insert(array, range);

        //print out sorted array
        for(i = 0; i < range; i++){
            System.out.print(array[i] + " ");
        }
    }
}