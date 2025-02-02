//create a thred class of runnable interface 
// class A implements Runnable{
//     public void run(){
//         for(int i=1;i<=3;i++){
//             System.out.println("child thread ");
//         }
//     }
// }
public class RunnableInterface{
    public static void main(String[] args){
        // A k=new A();
        Runnable k=()->{
            for(int i=1;i<=3;i++){
                System.out.println("child thread ");
            }
        };
        Thread t=new Thread(k);
        t.start();
    }
}