class StackTwo{
    int size,top=-1;
    int stack[];

    StackTwo(int size){
        this.size=size;
        stack=new int[size];
    }
    void push (int data){
        if(is_full()){
            System.out.println("Stack is full");
            return ;
        }
        else{
            top++;
            stack[top]=data;
            System.out.println(stack[top]+" is pushed to stack");
        }
    }
    void peek(){
        if(is_empty()){
            System.out.println("Stack is empty   stack underflow error ");
            return ;
        }
        else{

            System.out.println(stack[top]+" is at the top of stack");
        }
    }
    boolean is_full(){
        return top==size-1;
    }
    boolean is_empty(){
        return top==-1;
    }
    void pop(){
        if(is_empty()){
            System.out.println("Stack is empty   stack underflow error ");
            return ;
        }
        else{
            int data=stack[top];
            top--;
            System.out.println(data+" is popped from stack");
        }
    }
    void display(){
        System.out.println("\n elem \t \t position");
        System.out.println("__________________________");
        if(is_empty()){
            System.out.println("Stack is empty   stack underflow error ");
            return ;
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+"\t\t "+i);
            System.out.println("\n ");
        }
        System.out.println();
    }

//}
// public class StackTwo   {
    public static void main(String[] args) {
        StackTwo s=new StackTwo(8);
        StackTwo sc = new StackTwo(8);
        s.peek();
        s.display();
        s.push(10);
        s.pop();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(500);;
        s.push(600);
        s.display();
        s.peek();
        s.pop();
        s.peek();
        s.display();
        sc.push(100);
        sc.push(200);
        sc.display();
        System.out.println("Is stack s empty? "+s.is_empty());
        System.out.println("Is stack sc empty? "+sc.is_empty());
        System.out.println("Is stack s full? "+s.is_full());
        System.out.println("Is stack sc full? "+sc.is_full());
        System.out.println(sc+"  "+s);
        sc=s;
        sc.peek();
        System.out.println(sc+"  "+s);
    }
}