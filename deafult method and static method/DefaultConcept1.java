interface A{
   default void m1(){
        System.out.println("default method part of java 1.8 feature");
    }
}
class B implements A{

}
public class DefaultConcept1{
    public static void main(String[] args){
        B p=new B();
        p.m1();
    }
}