import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create list
        LinkedList list = new LinkedList();

        //create variables
        int value;
        char choice;
        int temp;
        boolean empty;

        //create scanner
        Scanner scnr = new Scanner(System.in);

        //ask user for choice
        System.out.println("Pick one: 'p'-push, 'o'-pop, 't'-top, 's'-size, 'e'-isEmpty, 'd'-done");
        choice = scnr.next().charAt(0);

        while(choice != 'd'){
            switch(choice){
                //if push is chosen
                case 'p':
                    //get value to add to stack
                    System.out.println("Enter a positive integer value: ");
                    value = scnr.nextInt();

                    //make sure value is positive
                    while(value < 0){
                        System.out.println("Enter a positive integer value: ");
                        value = scnr.nextInt();
                    }

                    //call push method
                    list.push(value);
                    break;

                //if pop is chosen
                case 'o':
                    //call pop method
                    temp = list.pop();

                    if(temp < 0){
                        System.out.println("List is empty");
                    }
                    else{
                        System.out.println(temp + " was removed from the top of the stack");
                    }
                    break;

                //if top is chosen
                case 't':
                    //call top method
                    temp = list.top();

                    if(temp < 0){
                        System.out.println("List is empty");
                    }
                    else{
                        System.out.println(temp + " is the top value");
                    }
                    break;

                //if size is chosen
                case 's':
                    //call size method
                    temp = list.size();

                    if(temp == 1){
                        System.out.println("1 element is stored");
                    }
                    else{
                        System.out.println(temp + " elements are stored");
                    }
                    break;
                //if isEmpty is chosen
                case 'e':
                    //call isEmpty method
                    empty = list.isEmpty();

                    if(empty){
                        System.out.println("List is empty");
                    }
                    else{
                        System.out.println("List is not empty");
                    }

            }
            //ask for next choice
            System.out.println("Pick one: 'p'-push, 'o'-pop, 't'-top, 's'-size, 'e'-isEmpty, 'd'-done");
            choice = scnr.next().charAt(0);
        }

    }
}