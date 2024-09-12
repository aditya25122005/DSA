
import bank.bank;

class shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class triangle extends shape{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}
class circle extends shape{
    public void area(int r){
        System.out.println(Math.PI*r*r);
    }
}
class equilateralTrinagle extends triangle{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}

public class OOPS {
    public static void main(String[] args) {
        bank obj =new bank();
        obj.show();
        



    }

    
}
