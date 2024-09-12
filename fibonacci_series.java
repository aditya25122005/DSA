import java.util.Scanner;
public class fibonacci_series {
    public static void  fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //0 1 1 2 3 5 8 13 
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-2);



    }
    
}
