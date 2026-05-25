class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CircularLinkedListImplementation{
    Node head= null;

    void append(int data) {
        Node newNode = new Node(data); // newNode holds both data and the object reference of the next node 
        if(head == null) {
            head = newNode;
            head.next = head; // point to itself
        }
        else {

            Node temp = head;

            while(temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head; // point to head
            head = newNode; // update head to the new node
        }
    }
    void appendUsingTail(int data) {
        Node newNode = new Node(data); // newNode holds both data and the object reference of the next node 
        if(head == null) {
            head = newNode;
            head.next = head; // point to itself
        }
        else {

            Node tail = head;

            while(tail.next != head) {
                tail = tail.next;
            }

            tail.next = newNode;
            newNode.next = head; // point to head
        head = newNode; // update head to the new node
        }

}
void InsertAtBeginning(int data) {
    Node newNode = new Node(data); // newNode holds both data and the object reference of the next node 
    if(head == null) {
        head = newNode;
        head.next = head; // point to itself
    }
    else {

        Node tail = head;

        while(tail.next != head) {
            tail = tail.next;
        }

        tail.next = newNode;
        newNode.next = head; // point to head
        head = newNode; // update head to the new node
    }

}
void InsertAtMiddle(int data, int position) {
    Node newNode = new Node(data); // newNode holds both data and the object reference of the next node 
    if(head == null) {
        head = newNode;
        head.next = head; // point to itself
    }
    else {

        Node temp = head;
        int count=0;
        Node prev = null;
        while(count < position-1) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        newNode.next = temp;
        prev.next = newNode;
    }

}
void deleteFirst() {
    if(head == null) {
        System.out.println("Circular linked list is empty");
        return;
    }
    if(head.next == head) {
        head = null;
        return;
    }
    Node tail = head;
    Node temp = head;
    while(tail.next != head) {
        tail = tail.next;
    }
    head = temp.next; // update head to the next node
    tail.next = head; // point to the new head
}
void deleteLast() {
    if(head == null) {
        System.out.println("Circular linked list is empty");
        return;
    }
    if(head.next == head) {
        head = null;
        return;
    }
    Node temp = head;
    Node prev = null;
    while(temp.next != head) {
        prev = temp;
        temp = temp.next;
    }
    prev.next = head; // point to head
}
void deleteAtPosition(int position) {
    if(head == null) {
        System.out.println("Circular linked list is empty");
        return;
    }
    if(position == 1) {
        deleteFirst();
        return;
    }
    Node temp = head;
    Node prev = null;
    int count=0;
    while(count < position-1) {
        prev = temp;
        temp = temp.next;
        count++;
    }
    prev.next = temp.next; // point to the next node of the node to be deleted
}
void display() {

        Node temp = head ;

        if(temp == null) {
            System.out.println("Circular linked list is empty");
            return;
        }

       while(temp.next != head) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print(temp.data); // Print the last node's data
        System.out.println();  
    }   
}
class circularLinkedList{
    public static void main (String [] args){
        CircularLinkedListImplementation cll = new CircularLinkedListImplementation();
        cll.append(10);
        cll.append(20);
        cll.append(30);

         cll.appendUsingTail(40);
        // cll.InsertAtBeginning(50);
        // cll.InsertAtMiddle(25, 3);
        cll.display();
        cll.deleteFirst();
         cll.display();
        cll.deleteLast();
        cll.display();
        cll.deleteAtPosition(1);
        cll.display();
    }
}