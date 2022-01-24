

public class InsertionLinkedList {
    Node head; //head of list

    class Node {
        int data;
        Node next;

        //Constructor to create Node
        Node(int d) {
            data = d;
            next = null;
        }
    }
        //Insertion at front of List, O(1)
        public void push(int new_data){
            //Allocate Node and put in data
            Node new_node = new  Node(new_data);

            //Make next of new node  as head
            new_node.next = head;

            //Move head to point to new Node
            head = new_node;
        }

        //Insertion after the given previous Node
        public void insertAfter(Node prev_node, int new_data)
        {
            //Check if the given Node is Null
            if(prev_node == null)
            {
                System.out.println("The given previous node cannot be null");
            return;
            }

            //Allocate the Node and put in the data
            Node newNode = new Node(new_data);

            //make next of new Node as next of prev_node
            newNode.next = prev_node.next;

            //make next of prev_node as new_node
            prev_node.next = newNode;
        }
        //insertion at the end of a linked list
       public void append(int new_data){
            //Allocate and put in data and set next as null
            Node new_Node = new Node(new_data);

            //if linked list is empty set new node as head
            if(head == null){
                head = new Node(new_data);
                return;
            }
            //since the new node is the last node make its next as null
            new_Node.next = null;

            //else traverse till the last node
            Node last = head;
            while (last.next != null)
                last = last.next;

            //change the next of last node
            last.next = new_Node;
            return;
        }
        //display
        public void display(){
            Node tnode = head;
            while(tnode != null){
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }


    public static  void main(String[] args){
        //Start with the empty list
        InsertionLinkedList list = new InsertionLinkedList();
        System.out.println("\nEmpty Linked list is: ");
        list.display();
        //Insert 5. Linked list becomes 5-> NULList
       list.append(5);

        //Insert 7 at the beginning So Linked list becomes 7->5-> NULList
        list.push(7);

        System.out.println("\nCreated Linked list  after adding 5 & 7: ");
        list.display();
        //Insert 1 at the beginning So Linked list becomes 1->7->5-> NULList
        list.push(1);

        System.out.println("\nCreated Linked list  after adding 1 to the front: ");
        list.display();
        //Insert 9 at the end So Linked list becomes 1->7->5->9 NULList
       list.append(9);

        System.out.println("\nCreated Linked list after adding 9 to the end: ");
        list.display();
        //Insert 12 after 7 So Linked list becomes 1->7->12->5->9 NULList
        list.insertAfter(list.head.next, 12);

        System.out.println("\nCreated Linked list after adding 12 between 7 and 5: ");
        list.display();
        System.out.println("\nCreated Linked list is: ");
        list.display();

    }

}
