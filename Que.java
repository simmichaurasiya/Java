/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simmi
 */
abstract class Queu {
    abstract void enque(int data);
    abstract void deque();
}
class Que extends Queu
{
        
  Node head,rear,front;
   class Node{
       int data;
       Node next;
       Node(int d)
       {
           data=d;
           next=null;
           
       }
   }
   public void enque(int data)
   {
       Node newNode=new Node(data);
       Node t=head;
       
       if(t==null)
       {
           head=newNode;
             
           return;
       }
       newNode.next=null;
       
       while(t!=null)
       {
         rear=t;
           t=t.next;
       }
       rear.next=newNode;
       return;
       
      
}
   public void deque()
   {
      front=head;
      if(front==null)
      {
      System.out.println("underflow");
      
      return;
      }
          
      front=front.next;
      head=front;
       
   }
   
   
   public void printque()
   {
       
       Node q=head;
      boolean isEmpty=true;
      if(q==null)
      {
       System.out.println(isEmpty+"-empty que");    
      }
       while(q!=null)
       {
           System.out.print(q.data+" ");
           q=q.next;
           
       }
   }
   public static void main(String args[])
   {
       Que qu=new Que();
       qu.deque();
               qu.enque(5);
      qu.enque(7);
               qu.enque(9);
       
       qu.printque();
   }
    
}
