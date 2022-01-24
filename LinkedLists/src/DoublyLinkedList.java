public class DoublyLinkedList {
    Node head; //head of list

    /*Doubly Linked list Node*/
    class Node{
        int data;
        Node next, prev;

        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
    }
    //Add a node in-front of the list
    public void push(int new_data)
    {
        //Allocate and put in data
        Node  new_node = new Node(new_data);

        //Make next of new Node as head and previous as Null
        new_node.next = head;
        new_node.prev = null;

        //change prev of head node to new node
        if(head != null)
            head.prev = new_node;

        head = new_node;
    }

    //display
    public void display(){
        DoublyLinkedList.Node tnode = head;
        while(tnode != null){
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String [] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(8);
        dll.push(67);
        dll.push(4);

        System.out.println("List created: ");
        dll.display();
    }


}

