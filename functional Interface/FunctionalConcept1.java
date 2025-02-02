//functional interface :when want to create only single abstract method 
//creation of functional interface 
interface A{
    //now create only single method :no return and no argument 
    void show();
}
//want to define another class 
class B implements A{
    public void show(){
        System.out.println("hello world ");
    }
}
public class FunctionalConcept1{
    public static void main(String [] args){
        B p=new B();
        p.show();

        A g=()->System.out.println("hii");
        g.show();
    }
}