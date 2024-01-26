import java.util.Scanner;
public class MergeSortMain {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int listSize;
        int i;
        int value;

        //size of list
        System.out.print("Enter number of item in list: ");
        listSize = scnr.nextInt();

        //add elements to queue
        for(i = 0; i < listSize; i++){
           System.out.print("Enter a positive value for " + (i+1) + ": ");
           value = scnr.nextInt();
           while(value < 0){
               System.out.print("Enter a positive value for " + (i+1) + ": ");
               value = scnr.nextInt();
           }
           //add to end of queue
           list.enqueue(value);
        }
        list.printList(list.head);
        System.out.println("");

        list.head = list.mergeSort(list.head);

        list.printList(list.head);
    }
}
