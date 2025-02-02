interface A{
    void even();
   
}
interface B{
    int even();
    
}
interface C{
    void even(int num);
    
}
interface D{
    int even(int num);
}
public class Even {
    public static void main(String[] args) {
        //all even code create through lamda expression 
        //no return and no argument 
        A s=()->{
            int num=9;
            if(num%2==0){
            System.out.println("even number ");
            }
            else{
                System.out.println("odd number number ");

            }
        };
        s.even();

        //return and no argument 
        B j=()->{
            int n=6;
            if(n%2==0){
                System.out.println("even number");
            }
            else{ 
                System.out.println("odd number ");
            }
           return n;
        };
        j.even();

        //no return and argument 
        C v=(int a)->{
            if(a%2==0){
                System.out.println("even number ");
            }
            else{
                System.out.println("odd number");
            }
        };
        v.even(4);

        //return and argument 
        D f=(int n)->{
            if(n%2==0){
                System.out.println("even number ");
            }
            else{
                System.out.println("odd number ");
            }
            return n;
        };
        f.even(6);
    }
}
