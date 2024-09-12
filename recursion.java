public class recursion{
    // public static void Printnum(int n){
    //     if(n==0)
    //         return;
    //     System.out.println(n);
    //     Printnum(n-1);
    // }

    // public static void printnum(int n){
    //     if (n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum(n+1);

    // }
    //sum of first n natural no.
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
        System.out.println(i);
        
        
        }



    


    public static void main(String[] args) {
        // Printnum(5);
        
        // int n=1;
        // printnum(n);
        // System.out.println("Done!");
        
        printsum(1, 5,0);
    }
}