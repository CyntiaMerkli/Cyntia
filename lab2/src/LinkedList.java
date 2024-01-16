public class LinkedList {
    public Node head = null;

    public void addFirst(int x){
        Node newNode = new Node(x);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp;
            temp = head;
            head = newNode;
            newNode.next = temp;
        }
        return;
    }
    public int removeFirst(){
        Node temp = head;

        if(head != null){
            head = temp.next;
            return temp.data;
        }
        else
            return -1;
    }
    public void addLast(int x){
        Node newNode = new Node(x);
        Node temp = head;
        Node prev = null;

        //if list is empty
        if(head == null){
           head = newNode;
        }

        //add to end
        else{
            while(temp != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = newNode;
        }
    }
    public int removeLast(){
        Node temp = head;
        int val;
        if(head == null){
            return -1;
        }
        else if(temp.next == null) {
            head = null;
            return temp.data;
        }
        else{
            while(temp.next.next != null){
                temp = temp.next;
            }
            val = temp.next.data;
            temp.next = null;
            return val;
        }

    }
    public int getFirst(){
        if(head != null){
            return head.data;
        }
        else
            return -1;
    }
    public int getLast(){
        Node temp = head;
        Node prev = null;

        if (head != null){
            while(temp != null){
                prev = temp;
                temp = temp.next;
            }
            return prev.data;
        }
        else
            return -1;

    }
    public int size(){
        int count = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            count ++;
        }
        return count;
    }
}
