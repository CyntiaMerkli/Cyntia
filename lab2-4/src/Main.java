import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create new list
        LinkedList list = new LinkedList();

        //create scanner
        Scanner scnr = new Scanner(System.in);

        //variables
        int value;
        char choice;
        //boolean check = false;

        //get user choice
        System.out.println("Choose one: 'e'-enqueue, 'd'-dequeue, 'f'-front, 's'-size, 'i'-isEmpty, 'D'-done");
        choice = scnr.next().charAt(0);

        while(choice != 'D'){
            switch(choice){
                //if enqueue is chosen
                case 'e':
                    //get input form user
                    System.out.println("Enter a positive integer to add to queue: ");
                    value = scnr.nextInt();
                    //make sure that value is positive
                    while(value < 0){
                        System.out.println("Enter a positive integer to add to queue: ");
                        value = scnr.nextInt();
                    }

                    //call enqueue method
                    list.enqueue(value);
                    break;

                //if dequeue is chosen
                case 'd':

                    //call dequeue method if list in not empty
                    if(!list.isEmpty()){
                        value = list.dequeue();
                        System.out.println(value + " was removed from the front of the queue");
                    }
                    //if list is empty
                    else
                        System.out.println("Queue is empty");
                    break;

                //if front is chosen
                case 'f':
                    //if list is not empty, call front method
                    if(!list.isEmpty()){
                        value = list.front();
                        System.out.println(value + " is at the front of the queue");
                    }
                    else
                        System.out.println("List is empty");
                    break;

                //is size is chosen
                case 's':
                    //call size method
                    value = list.size();

                    if(value == 1){
                        System.out.println("There is 1 element in the queue");
                    }
                    else
                        System.out.println("There are " + value + " elements in the queue");
                    break;

                //if isEmpty is chosen
                case 'i':
                    //call is empty method
                    if(list.isEmpty()){
                        System.out.println("Queue is empty");
                    }
                    else
                        System.out.println("Queue is not empty");
                    break;

            }

            //get users next choice
            System.out.println("Choose one: 'e'-enqueue, 'd'-dequeue, 'f'-front, 's'-size, 'i'-isEmpty, 'D'-done");
            choice = scnr.next().charAt(0);
        }


    }
}