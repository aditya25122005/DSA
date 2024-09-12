
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element to find :");
        int find=sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (arr[i][j]==find){
                    System.out.println(i+", "+j);
                    break;
                }
            }
        }




        // int [][] arr1=new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
                
        //         System.out.println("Enter element for "+i+","+j);
        //         arr1[i][j]=sc.nextInt();

        //     }
        // }
        // int [][] arr2=new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         arr2[i][j]=sc.nextInt();
        //     }
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print((arr1[i][j]*arr2[i][j])+" ");
        //     }
        //     System.out.println();
        // }
    
}
    
}
