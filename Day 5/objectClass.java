class objectClass{
    public static void main(String[] args){
        // Abc x=new Abc();

        // Mno y=new Mno();
        // Xyz z=new Xyz();
        // Pqr p=new Pqr();
        Object X;
        X=new Mno();    
       // X=new Xyz();
        X=new Abc();
        X=new Xyz(); // upcasting
        X=new Mno(); // upcasting
        //X=new Pqr();
        System.out.println(X+"  "+ X.hashCode());
        //System.out.println( ((Abc)X).a);
        //System.out.println((((Abc)(Mno))X).a);
        System.out.println( ((Xyz)X).a); // class cast exception
        int k= ((Mno)X).a; // downcasting   
        System.out.println( k);

    }
}
// class Pqr{
//     int a=40;
// }

class Abc{
    int a=10;
}
class Mno{
    int a=20;

}
class Xyz{
    int a=30;
}
