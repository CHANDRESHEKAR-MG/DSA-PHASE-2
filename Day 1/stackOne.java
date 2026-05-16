class stackOne{
    public static void main(String[] args) {
        stackOne s=new stackOne(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
    int size;
    int stack[];
    int top=-1;
    stackOne(int size){
        this.size=size;
        stack=new int[size];
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stack[top]=data;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            int data=stack[top];
            top--;
            return data;
        }
        return -1;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            return stack[top];
        }
        return -1;
    }   
}