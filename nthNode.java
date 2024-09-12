public class nthNode {
    Node head;
    int size;
    nthNode(){
        this.size=0;
    }
    class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public void addFirst(int val){
        
        Node newNode=new Node(val);
        // if(head==null){
        //     head=newNode;
        //     return;
        // }
        
        
        newNode.next=head;
        head=newNode;
        size++;

    }
    public void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+"-->");
            curr=curr.next;
            

        }
        System.out.println("Null");
    }
    public void getSize(){
        
        System.out.println(size);


    }
    public void find(int n){
        n=2;
        int index=size-n+1;
        int i=1;
        Node find=head;
        while(i<index){
            find=find.next;

        }System.out.println(find.val);
    }
    public static void main(String[] args) {
        nthNode ll=new nthNode();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.printList();
        ll.getSize();
        ll.find(2);
       

    }
    
}
