public class LinkedList {
    public Node head = null;

    //to add a value to the stack
    public void push(int x){
        Node newNode = new Node(x);
        Node temp;
        if(head == null){
            head = newNode;
        }
        else{
            temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }

    //to remove top of stack
    public int pop(){
        Node temp = head;
        if(head == null){
            return -1;
        }
        else{
            head = temp.next;
            return temp.data;
        }
    }

    //if user wants top element
    public int top(){
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }

    //if user wants size of stack
    public int size(){
        Node temp = head;
        int count = 0;

        while(temp != null){
            count ++;
            temp = temp.next;
        }

        return count;
    }

    //if user wants to check if stack is empty
    public boolean isEmpty(){
        return head == null;
    }


}

