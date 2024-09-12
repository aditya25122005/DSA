
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();

        arr2.add("Adi");
        arr2.add("Anurag");
        arr2.add("GLA");
        arr2.remove(1);

        arr2.set(0, "Abhay");
        System.out.println(arr2);


        arr.add(7);
        arr.add(79);
        arr.add(5);
        arr.add(3, 40);

        arr.add(1, 2);
        System.out.println(arr.get(2));
        Collections.sort(arr);

        System.out.println(arr);
    }
    
}
