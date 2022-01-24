public class SinglyLinkedList {
    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        //Constructor to create Node
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    //represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data){
        //Create a new node
        Node newNode = new Node(data);

        //Check if list is empty
        if(head == null) {
            //if list is empty both head and tail will point to new node
            head = newNode;
            tail = newNode;
            return;
        }
        else{
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            tail = newNode;
        }

    }

    //function to display all nodes present
    public void display(){
        //Node current will point to head
        Node current = head;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current!= null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        SinglyLinkedList sList = new SinglyLinkedList();

        //add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(9);

        //display nodes present in the list
        sList.display();
    }
}
