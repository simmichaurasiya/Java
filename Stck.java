/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simmi
 */
abstract class stk
{
abstract void push(int data);
abstract void pop();
}

class Stck extends stk
 {
    Node head;
    Node pp;
    class Node
    {
        
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    public void push(int data)
    {
        Node newNode=new Node(data);
     
        newNode.next=head;
        head=newNode;
       
    }
   public void pop()
   {
       
     pp=head;
     if(pp==null)
     {
         System.out.println("stack underflow");
         return;
     }
     pp=pp.next;
     head=pp;
   }
   public void printStk()
   {
       Node prnt=head;
       while(prnt!=null)
       {
           System.out.println(prnt.data+" ");
           prnt=prnt.next;
       }
      prnt=null;
   }
   public static void main (String args[])
   {
       Stck cll=new Stck();
       cll.push(1);
        cll.push(2);
         cll.push(3);
          cll.push(4);
        cll.pop();
       cll.printStk();
   }
}
