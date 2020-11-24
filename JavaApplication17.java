
package javaapplication17;
class Node
{
    int data;       
    Node next;
    public Node(int data)
    {
      
        this.data = data;
        this.next = null;
    }
}
class Queue
{
      Node rear = null, front = null;
         public void enqueue(int item)    
    {
     
        Node node = new Node(item);
        System.out.println(" "+ item);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }   
    public  void dequeue()     
    {
        if (front == null) {
            System.out.println("\nQueue Underflow");
        }
        else{
        Node temp = front;
        System.out.println(" "+ temp.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        int item = temp.data;
      
        }
   
    }
    public void show() {
      Node temp = front;
      while(temp.next!= null)
      {
          System.out.println("  "+temp.data);
          temp=temp.next;
      } 
      System.out.println("  "+temp.data);
  }  
    public int peeek() {
        if (front != null) {
            System.out.println(" front item  : "+ front.data);
        } else {
            System.out.println(" list is empty");
                 }
       return -1;
    }
}
public class JavaApplication17 {

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(" add item .................. ");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("......................... ");
        q.peeek();
        System.out.println(" ........................ ");
        System.out.println(" display item ");
        q.show();
        System.out.println("--------------------------");
        System.out.println(" removing item from list  ");
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
    
}
