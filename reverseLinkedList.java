public class reverseLinkedList{
    Node head;

    class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }

    public void addFirst(int val){
        
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int val){
        Node newNode =new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;

        }
        currNode.next=newNode;

    }
    public void reverse(){
        if(head==null ||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;

            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;

        }
        Node curr=head;
        while(curr!=null){
            
            System.out.print(curr.val+"-->");
            curr=curr.next;
        }
        System.out.print("Null");

    }
    public static void main(String[] args) {
        reverseLinkedList l1=new reverseLinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        
        l1.reverse();
        l1.printList();
    }
}