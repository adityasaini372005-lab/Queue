
import java.util.*;

public class QueueY {
  /**   static class queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        queue(int n){
        arr = new int [n];
        this.size=n;
    }
    public static boolean isEmpty(){
        return rear == -1&& front==-1;
    }   
    public static boolean isFull(){
        return (rear+1)%size==front;
    }

    //Enqueue
    public static void add(int data){
       // if(rear==size-1){
        if(isFull()){ 
       System.out.println("Queue is full");
        return;
        }
        // 1st element add
        if(front== -1){
            front=0;
        }
       // rear++;
       rear=(rear+1)%size;
       arr[rear]=data;
    }

    //dequeue
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
       // int front=arr[0];
       int result=arr[front];
       if(rear==front){
        rear=front=-1;
       }else{
        front=(front+1)%size;
       }
      //  for(int i=0;i<rear;i++){
        //    arr[i]=arr[i+1];
       // }
       // rear--;
       // return front;
       return result;
    }
    // peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
         }
      //   return arr[0];
      return arr[front];
        }
 }**/
 public static void main(String[] args) {
    // queue q = new queue(5);

    // Using collection framework
   /// Queue <Integer> q = new LinkedList<>();
       Queue <Integer> q = new ArrayDeque<>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
     }
    }
    
}
