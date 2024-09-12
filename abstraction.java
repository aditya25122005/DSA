interface Animal{
    public void walk();

    public void eat();
}
class Horse implements Animal,herbivore{
    public void  walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eat(){
        System.out.println("Horse eats chana");
    }
}
interface herbivore{

}
public class abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();
    }
    
}
