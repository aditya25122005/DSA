import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        //concatenation
        String first="Tony";
        String last="Tony";

        if(first.compareTo(last)==0){
            System.out.println("Strings are equal");
            
        }

        else{
            System.out.println("Strings are not equal");
        }

        if(new String("Adi")==new String("Adi")){      ///wrong
            System.out.println("Equal");
        }
        else{
            System.out.println("Not");
        }
        System.out.println(first.substring(1,3));
        


        
    }
    
}
