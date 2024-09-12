public class findSecondLargest {
    static void secondLargest(int []arr,int size){
        int largest=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int secLarge=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>secLarge &&arr[i]<largest){
                secLarge=arr[i];
            }

        }
        System.out.println(secLarge);
    }
    public static void main(String[] args) {
        int [] arr={23,34,12,2,34,221,333,121};
        int size=arr.length;
        secondLargest(arr, size);
    }
    
}
