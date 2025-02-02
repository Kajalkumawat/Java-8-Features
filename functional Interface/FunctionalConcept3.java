interface A{
    int show(int a,int b);
}
class B implements A{
    public int show(int a,int b){
        return a+b;
    }
}
public class FunctionalConcept3 {
    public static void main(String[] args) {
        B k=new B();
        System.out.println(k.show(4, 6));

        A s=(int a,int b)-> a-b;
       System.out.println( k.show(5, 2));;
    }
}
