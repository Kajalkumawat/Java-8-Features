interface A{
    default void show(){
        System.out.println("default method");
    }
}
interface C{
    void show();
}
class B implements  A{
    public void show(){
        A.super.show();
        System.out.println("interface C method ");
    }
}
public class DefaultConcept2 {
    public static void main(String[] args){
        B p=new B();
        p.show();
        //then print C method when want to access the default then used super keyword 
    }
}
