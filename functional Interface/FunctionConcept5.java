interface A{
    void even();
}
public class FunctionConcept5 {
    public static void main(String[] args) {
        A s=()->{
            int n=3;
            if(n%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("not valid");
            }
        };
        s.even();

    }
}
