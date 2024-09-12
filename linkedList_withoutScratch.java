
import java.util.*;
public class linkedList_withoutScratch {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();
        l1.addFirst("A");
        l1.addLast("B");
        l1.addFirst("RAM");
        l1.add("sita");
        System.out.println(l1.size());

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i)+"-->");
        }
        System.out.println("Null");
    }
    
}
