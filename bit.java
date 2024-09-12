public class bit {
    public static void main(String[] args) {


        int pos=2;
        int num=5;
        int notBitmask=~(1<<pos);
        int newnum=notBitmask & num;
        System.out.println(newnum);

        
    // int pos=1;
    // int n=5;

    //     int bitmask=1<<pos;
    //     int newNum=bitmask|n;
    //     System.out.println(newNum);

    }}

//     int pos=2;
//     int n=5;
//     int bitMask=1<<pos;
//     if((bitMask & n)==0){
//         System.out.println("Bit was zero");
//     }
// else{
//     System.out.println("Bit was one");
// }

