interface A{
    int show();
}
class B implements A{
    public int show(){
        int a=9;
        return a;
    }
}
public class FunctionalConcept4 {
    public static void main(String[] args) {
        B h=new B();
        System.out.println(h.show());

        A s=()->9;
        System.out.println(s.show());
    }
}
