public class bubblesort {
    public static void printarr(int arr []){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    } 
    public static void main(String[] args) {
      
        
    
    int[] arr={7,8,3,1,2};
    for(int i=1;i<arr.length;i++){
        int current=arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        //place
        arr[j+1]=current;
    }
    printarr(arr);

    // for(int i=0;i<arr.length;i++){
    //     int smallest=i;
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[smallest]>arr[j]){
    //             smallest=j;
    //         }
    //     }
                
    //             //swap
    //             int temp=arr[smallest];
    //             arr[smallest]=arr[i];
    //             arr[i]=temp;
            
        
    // }

    // for(int i=0;i<arr.length-1;i++){
    //     for(int j=0;j<arr.length-i-1;j++){
    //         //swap
    //         if(arr[j]>arr[j+1]){
    //         int temp=arr[j];
    //         arr[j]=arr[j+1];
    //         arr[j+1]=temp;
    //         }

    //     }
    // }
    // printarr(arr);

}
}
