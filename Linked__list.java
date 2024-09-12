

public class Linked__list {
    Node head;
    private int size;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        //traverse
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }

        currnode.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            head=null;
            return;
        }
        size--;
        head=head.next;

        
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node Last=head.next;
        while(Last.next!=null){
            Last=Last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void reverseIterable(){
        if(head==null || head.next==null){
            return;
        }
        
        Node preNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=preNode;

            //update
            preNode=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=preNode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("Null");

    
        
    }
    public static void main(String[] args) {
        Linked__list l1=new Linked__list();
        l1.addFirst("name");
        l1.addFirst("My");
        l1.addLast("is");
        l1.addLast("Aditya");
        
        l1.printList();
        l1.reverseIterable();
        l1.printList();
        
    }


    
}
