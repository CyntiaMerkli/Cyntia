// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create list
        LinkedList list = new LinkedList();

        //variables
        int value = 0;
        char choice;
        int temp;

        //scan choice
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose one: 'a'-add first, 'b'-remove first, 'c'-add last, 'd'-remove last, 'e'-get first, 'f-get last, 'g'-size, 'D'-done");
        choice = scnr.next().charAt(0);

        //loop choices until choice is 'd'
        while(choice != 'D'){

            //if user wants to add first
            if(choice == 'a'){
                System.out.println("Enter a positive integer to add to list: ");
                value = scnr.nextInt();

                while(value < 0){
                    System.out.println("Enter a positive integer to add to list: ");
                    value = scnr.nextInt();
                }

                //call addFirst method
                list.addFirst(value);
            }

            //if user wants to remove first
            else if(choice == 'b'){
                //call removeFirst method
                temp = list.removeFirst();

                if(temp < 0){
                    System.out.println("List is empty");
                }
                else {
                    System.out.println("First node was removed, containing " + temp);
                }
            }

            //if user want to add last
            else if(choice == 'c'){
                System.out.println("Enter a positive integer to add to list: ");
                value = scnr.nextInt();

                while(value < 0){
                    System.out.println("Enter a positive integer to add to list: ");
                    value = scnr.nextInt();
                }

                //call addLast method;
                list.addLast(value);
            }

            //if user wants to remove last
            else if(choice == 'd'){
                //call removeLast method
                temp = list.removeLast();

                if(temp < 0){
                    System.out.println("List is empty");
                }
                else{
                    System.out.println("Last node was removed, containing " + temp);
                }

            }

            //if user wants to get first
            else if(choice == 'e'){
                //call getFirst method
                temp = list.getFirst();
                if(temp < 0){
                    System.out.println("List is empty");
                }
                else
                    System.out.println("First node has a value of " + temp);
            }

            //if user want to get last
            else if(choice == 'f'){
                //call getLast method
                temp = list.getLast();
                if (temp < 0){
                    System.out.println("List is empty");
                }
                else
                    System.out.println("Last node has a value of " + temp);
            }

            else if(choice == 'g'){
                //call size method
                temp = list.size();
                if(temp < 0){
                    System.out.println("List is empty");
                }
                else
                    System.out.println("The list has " + temp + " nodes");
            }

            //get next user choice
            System.out.println("Choose one: 'a'-add first, 'b'-remove first, 'c'-add last, 'd'-remove last, 'e'-get first, 'f-get last, 'g'-size, 'D'-done");
            choice = scnr.next().charAt(0);
        }

    }
}