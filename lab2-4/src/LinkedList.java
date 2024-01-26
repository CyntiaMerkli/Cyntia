public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public void enqueue(int x){
        //make new node
        Node newNode = new Node(x);

        //if queue is empty
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }
    public int dequeue(){
        Node temp = head;

        head = temp.next;
        return temp.data;
    }

    public int front(){
        return head.data;
    }

    public int size(){
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(Node head){

        if(head == null){
            return;
        }

        else{
            System.out.print(head.data + " ");
            printList(head.next);
        }

    }

    public Node mergeSort(Node h){
        //base case: head is null/queue is empty, return head
        if(h == null || h.next == null){
            return h;
        }

        //System.out.println("head:" + head.data);
        //find middle of queue
        Node middle = findMiddle(h);
        //refer to middle next to be able tp split queue into two, and keep track of both
        Node middleNext = middle.next;
        middle.next = null;

        //do merge sort on the left side/queue
        Node leftSide = mergeSort(h);
        //do merge sort on the right side/queue
        Node rightSide = mergeSort(middleNext);

        //merge the left and right sides together

        //return the sorted list reference to sorted list
        return merge(leftSide, rightSide);
    }

    public Node findMiddle(Node h){
        Node temp = h;
        Node middle = h;

        if(temp == null){
            return null;
        }
        else{
            //using two reference nodes, find the middle by having one node that moves twice ahead the node looking for middle
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next.next;
                middle = middle.next;
            }
            return middle;
        }


    }

    private Node merge(Node left, Node right){
        Node newNode = null;
        Node tempLeft = left;
        Node tempRight = right;
        LinkedList x = new LinkedList();
        int i = 0;
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        while(tempLeft != null || tempRight != null){
            if(tempRight != null && tempLeft == null){
                x.enqueue(tempRight.data);
                tempRight = tempRight.next;
            }
            else if(tempRight == null){  //tempLeft != null was removed
                x.enqueue(tempLeft.data);
                tempLeft = tempLeft.next;
            }
            else if(tempLeft.data <= tempRight.data){
                x.enqueue(tempLeft.data);
                tempLeft = tempLeft.next;
            }
            else {
                x.enqueue(tempRight.data);
                tempRight = tempRight.next;
            }
        }
        return x.head;
    }
}
