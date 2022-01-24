public class DeleteLinkedList {
    Node head; //head of list

    //Linked list Node
    class Node{
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void deleteNode(int key)
    {
        //Store head node
        Node temp = head, prev = null;

        //if head node holds the key to be deleted
        if(temp != null && temp.data == key){
            head = temp.next; //changed head
            return;
        }

        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        //if key was not present in linked list
        if(temp == null)
            return;

        //Unlink the node from linked list
        prev.next = temp.next;
    }

    //Insert a new Node at front of the list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void display(){
        Node tnode = head;
        while(tnode != null){
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args){
        DeleteLinkedList list = new DeleteLinkedList();

        list.push(9);
        list.push(2);
        list.push(12);
        list.push(8);

        System.out.println("\nCreated Linked list is:");
        list.display();

        list.deleteNode(8); // Delete node with data 1

        System.out.println(
                "\nLinked List after Deletion of 8:");
        list.display();
    }
}
