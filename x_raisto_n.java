public class x_raisto_n {
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;

        }
        if(x==0){
            return 0;
        }
        // int xpown1=calcPower(x, n-1);
        // int xpown=x*xpown1;
        // return xpown;

        //log n complexity

        if(n%2==0){
            return calcPower(x, n/2)* calcPower(x, n/2);
        }
        else{
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=6;
        System.out.println(calcPower(x, n));
        
    }
    
}
