import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create list
        LinkedList list = new LinkedList();
        int count;
        char temp;
        char input;

        //boolean error = false;
        boolean flag = false; // true if brackets are not matched
        boolean error = false;

        //Create scanner
        Scanner scnr = new Scanner(System.in);

        //create variables
        String userInput;

        //get string from user
        System.out.println("Enter a string: ");
        userInput = scnr.nextLine();

        for(count = 0; count < userInput.length(); count++){
            input = userInput.charAt(count);

            //if character is an opening bracket
            if(userInput.charAt(count) == '(' || userInput.charAt(count) == '[' || userInput.charAt(count) == '{'){
                list.push(userInput.charAt(count));
            }

            //if character is a closing bracket
            else if(userInput.charAt(count) == ')' || userInput.charAt(count) == ']' || userInput.charAt(count) == '}'){
                temp = list.top();

                if(temp == '(' && userInput.charAt(count) == ')'){
                    list.pop();
                    continue;
                }
                else if(temp == '[' && userInput.charAt(count) == ']'){
                    list.pop();
                    continue;
                }
                else if(temp == '{' && userInput.charAt(count) == '}'){
                    list.pop();
                    continue;
                }
                else{
                    flag = true;
                    break;
                }
            }

            //characters that are ignored
            else if((input != '0') && (input != '1') && (input != '2') && (input != '3') && (input != '4') && (input != '5') && (input != '6') && (input != '7') && (input != '8') && (input != '9') && (input != '+') && (input != '-') && (input != '*') && (input != '/')){
                error = true;
                System.out.println("Invalid Input");
                break;
            }

        }

        if(list.isEmpty() && !flag){
            System.out.println("Brackets are balanced");
        }

        else if(flag || !list.isEmpty() || (count != userInput.length() - 1))
            if(!error){
                System.out.println("Brackets are not balanced");
            }

    }
}