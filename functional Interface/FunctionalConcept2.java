interface A{
    void add(int a,int b);
}
class B implements  A{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
public class FunctionalConcept2 {
    public static void main(String[] args){
        B k=new B();
        k.add(1,4);

        A s=(int a,int b)->System.out.println(a+b);
        s.add(3,4);
    }
}
