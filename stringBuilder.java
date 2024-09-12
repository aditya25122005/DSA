public class stringBuilder {
    public static void main(String[] args) {

        

        StringBuilder sb=new StringBuilder("hello");
        // System.out.println(sb.reverse());

        // String s="Aditya";
        // char arr[] =s.toCharArray();

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontc=sb.charAt(front);
            char backc=sb.charAt(back);

            sb.setCharAt(front, backc);
            sb.setCharAt(back, frontc);
        }
        System.out.println(sb);




        
        
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0, 'p');       
        // System.out.println(sb);

        // sb.insert(2, 'k');
        // System.out.println(sb);

        // sb.delete(1, 3);
        // System.out.println(sb);


    }




}

