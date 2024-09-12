public class factorialUsingRecursion {
    public static int printfactorial(int n){
        if(n==0 || n==1){
            
            return 1;
        }
        else{
                return n*printfactorial(n-1);
            }
        



    }

    public static void main(String[] args) {
        int n=5;
        
        System.out.println(printfactorial(n));
        
    }

}
