public class reverseALinkedList{
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
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.val+"-->");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }
    public void reverse(){
        if(head==null || head.next==null){
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
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
        reverseALinkedList ll=new reverseALinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.reverse();
        ll.printList();
    }
}