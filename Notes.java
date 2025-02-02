// default method and static method part of java 1.8 features :

// Default method :
// ->default method is also known as virtual extension method and defender method 
// ->when want to create defination in interface then used default keyword

// DefaultConcept1.java
// interface A{
//    default void m1(){
//         System.out.println("default method part of java 1.8 feature");
//     }
// }
// class B implements A{

// }
// public class DefaultConcept1{
//     public static void main(String[] args){
//         B p=new B();
//         p.m1();
//     }
// }
// -------------------------------------------------------------------
// override the default method then call it it is also the part of java 1.8 feature : 
// interface A{
//     default void show(){
//         System.out.println("default method");
//     }
// }
// interface C{
//     void show();
// }
// class B implements  A{
//     public void show(){
//         A.super.show();
//         System.out.println("interface C method ");
//     }
// }
// public class DefaultConcept2 {
//     public static void main(String[] args){
//         B p=new B();
//         p.show();
//         //then print C method when want to access the default then used super keyword 
//     }
// }
// ------------------------------------------------------------------------------
// static method in interface :
// ->it is also the feature of java 1.8 

// interface method :implicit by default public abstract when want to create static method then apply this keyword
// interface A{
//      static void show(){
//         System.out.println("hii");
//     }
// }

// public class StaticInterface {
//     public static void main(String[] args) {
//         A.show();
//     }
// }
// ------------------------------------------------------------------------------
// variable by default implicity public static and final 
