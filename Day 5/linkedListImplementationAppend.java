class Node {
    int data;
    Node Add = null;
    Node(int data) {// constructor to initialize the data and the next node reference
        this.data = data;// data is stored in the node  
        this.Add = null;// the next node is null by default
    }
}
class LinkedList {
    Node head= null;
    void append(int data) {
        Node newNode = new Node(data); // newNode holds both data and the object reference of the next node 
        if(head == null) {
            head = newNode;
        }
        else {

            Node temp = head;

            while(temp.Add != null) {
                temp = temp.Add;
            }

            temp.Add = newNode;
        }
    }

    void display() {

        Node temp = head ;

        while(temp != null) {

            System.out.print(temp.data + " -->");

            temp = temp.Add;
        }
        System.out.print("null");
        System.out.println();  
    }
    void length() {

        Node temp = head;

        int count = 0;

        while(temp != null) {

            count++;

            temp = temp.Add;
        }
        System.out.println("Length of the linked list is: " + count);
    }
    void search(int key) {

        Node temp = head;
        if(temp == null) {
            System.out.println("Linked list is empty");
            return;
        }

        while(temp != null) {

            if(temp.data == key) {
                System.out.println("Element found in the linked list to search: " + temp.data);
                return;
            }
            temp = temp.Add;
        }
        System.out.println("Element not found in the linked list to search");
    }
    void delete(int key) {

        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == key) {
            head = temp.Add;// head is not null but key is there then head will point to the next node and the current node will be deleted 
            System.out.println("Element deleted from the linked list to delete: " + temp.data);   
            return;
        }

        while(temp != null && temp.data != key) {// if temp is not null and the data is not equal to the key then we will move forward in the linked list and keep track of the previous node
            prev = temp;
            temp = temp.Add;
            //System.out.println(temp.data);
            
        }

        if(temp == null) {// if temp is null then the key is not found in the linked list
            System.out.println("Element not found in the linked list to delete");
            return;
        }

        prev.Add = temp.Add; // if the key is found then we will update the next node reference of the previous node to point to the next node of the current node and the current node will be deleted
        System.out.println("Element deleted from the linked list to delete: " + temp.data);
    }
}

public class linkedListImplementationAppend{

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.display();
        list.length();
        list.search(20);
        list.search(40);
        list.delete(1000);
        list.delete(20);
        list.display();
    }
}