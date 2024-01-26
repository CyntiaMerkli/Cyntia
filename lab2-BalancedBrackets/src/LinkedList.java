public class LinkedList {
    Node head = null;

    //add to stack
    public void push(char x){
        Node newNode = new Node(x);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }
    //remove top from stack
    public void pop(){
        Node temp = head;

        head = temp.next;
    }
    //return top element
    public char top(){
        if(head == null){
            return 'X';
        }
        else{
            return head.data;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}
