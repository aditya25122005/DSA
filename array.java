//Array
import java.util.*;
public class array{
    public static void main(String args []) {
        Scanner sc=new Scanner(System.in);

        
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search index");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("found at index :"+i);
                break;
            }
            
        }
        // int size=sc.nextInt();
        // int [] arr=new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int ele:arr){
        //     System.out.println(ele);
        // }

        // int [] arr=new int[5];
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;
        // String [] names={"Aditya","Btech","DSA","webde"};
        // for(String ele:names){
        //     System.out.println(ele);
        // }
        // for(int ele:arr){
        //     System.out.println(ele);
        // }
        // System.out.println(names[0]);
    }
}