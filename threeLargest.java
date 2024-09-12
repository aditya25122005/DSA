

public class threeLargest {
    static void Largest(int[]arr,int n){
        int first,second,third,i;
        if(n<3){
            System.out.println("Invalid");
        }
        first=second=third=Integer.MIN_VALUE;
        for( i=0;i<n;i++){
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second ){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }

        }
        System.out.println(first+" "+second+" "+third);
    }
    public static void main(String[] args) {
        int [] arr={20,30,40,90,100,120,60};
        int n=arr.length;
        Largest(arr, n);
    }
    
}
