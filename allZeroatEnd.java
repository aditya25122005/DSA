public class allZeroatEnd {
    static void pushZeroes(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,0,4,0,3,0,2,5};
        int n=arr.length;
        pushZeroes(arr, n);
    }
    
}
