class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    void append(int data){
         Node newNode = new Node(data); // newNode holds both data and the object reference of the next node 
        if(head == null) {
            head = newNode;
        }
        else {

            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }
    void display() {

        Node temp = head ;

        while(temp != null) {

            System.out.print(temp.data + " -->");

            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();  
    }
        void reverse() {
            Node prev = null;
            Node temp = head;
            Node next = null;
            while(temp != null) {
                next = temp.next; // store the next node
                temp.next = prev; // reverse the link
                prev = temp; // move prev to current
                temp = next; // move to the next node
            }
            head = prev; // update head to the new first node
        }
}
class revLinkList{
    public static void main(String[]args){
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.display();
        ll.reverse();
        ll.display();

    }
    

}