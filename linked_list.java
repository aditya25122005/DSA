public class linked_list {
    Node head;
    Node tail;
private int size;
    
    linked_list(){
        this.size=0;

    }

    class Node{
        String data;
        
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    
    //add- first,last

    public void addfirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        if(head==null){
            head=newNode;
            return;
        }
        size++;

    
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=head;
            return;
        }
        //traverse
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }
//traverse 
Node secondLast=head;
Node lastNode=head.next;
while(lastNode.next!=null){
    lastNode=lastNode.next;
    secondLast=secondLast.next;
}
secondLast.next=null;

    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node CurrNode=head;
        while(CurrNode!=null){
            System.out.println(CurrNode.data+"-->");
            CurrNode=CurrNode.next;
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        linked_list list=new linked_list();
        list.addfirst("a");
        list.addfirst("is");
        list.addLast("ADITYA");
        list.deleteFirst();
        // list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        //print
       

        
}

    
}
