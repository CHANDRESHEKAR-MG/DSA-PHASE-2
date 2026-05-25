
    class Abc{
        static {
            System.out.println("static  method of classabc");
        }
    static{
        System .out.println("static block of abc");
    }
    {
        System.out.println("instance block of abc");
    }
    Abc(){
        System.out.println("constructor of abc");
    }
    Abc(int a){
        System.out.println("parameterized constructor of abc with value a:"+ a);
    }

}


class  staticMethod{
    static  {
        System.out.println("static block of Main class");
    }
    {
        System.out.println("instance of main class");
    }
      public static void main(String[] args) {
     // new staticMethod();
      new Abc();
      new Abc(100);
          
      }
    }
