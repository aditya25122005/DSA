public class LL {

    private Node head;
    private Node tail;

    private int size;


    public LL(){
        this.size=0;
    }


    private class Node{

        private int value;
        private Node next;


        public Node(int value){
            this.value=value;
        }


        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        

    }
    public void addFirst(int val){
        Node newNode=new Node(val);
        
        newNode.next=head;
        head=newNode;
        

        if(tail==null){
            tail=head;
            
        }
        size++;

    }
    public void addLast(int val){
        Node newNode=new Node(val);
        if(tail==null){
            // head=newNode;
            addFirst(val);
            return;
        }
        
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            addFirst(val);
            return;
        }
        if(index==size-1){
            addLast(val);
            return;
        }

        Node curr=head;
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        Node newNode=new Node(val,curr.next);
        curr.next=newNode;

        size++;
    }

    //delete first
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //delete last
 
    public void deleteLast(){
        Node secondLast=head;
        Node  Last=head.next;
        while(Last.next!=null){
            Last=Last.next;
            secondLast=secondLast.next;

        }
        secondLast.next=null;
    }
    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node curr=head;
        for(int i=1;i<index;i++){

            curr=curr.next;

        }
        curr.next=curr.next.next;
        size--;

    }
    public void reverseIterate(){
        if(head==null|| head.next==null){
            return;
        }
        Node prevNode=head;
        Node CurrNode=head.next;
        while(CurrNode!=null){
            Node nextNode=CurrNode.next;
            CurrNode.next=prevNode;
        
            //update
            prevNode=CurrNode;
            CurrNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newhead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;

    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.value+"-->");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }
    
    
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst(4);
        list.addFirst(2);
        list.addFirst(0);
        list.addLast(40);
        list.addLast(99);
        list.insert(50, 2);

        // list.deleteFirst();
        // list.deleteLast();
        // list.deleteLast();
        // list.printList();
        // list.delete(2);
        list.printList();
        // list.reverseIterate();
        list.head=list.reverseRecursive(list.head);

        list.printList();
        
       




    }
   



 
    
}
