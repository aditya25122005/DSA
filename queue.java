public class queue{

    static class Q{
        static int[] arr;
        static int n;
        static int rear=-1;
        static int front=-1;

        Q(int n){
            this.n=n;
            arr=new int[n];

        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1) %n ==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;

            }
            //add first
            if(front==-1){
                front=0;
            }
            rear=(rear+1) %n;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result=arr[front];
            if(rear==front){  //only one element
                rear=front=-1;
            }
            else{
                front=(front+1)%n;
            }
            

            return result;

            
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
           return arr[front];
        }
    }
    public static void main(String[] args) {
        Q q=new Q(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        System.out.println("removing done!");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}