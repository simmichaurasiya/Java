
public class D { 
    Node head; class Node { 
        int data; 
        Node prev; 
        Node next; 
  Node(int d) { data = d; } 
    } 
    public void insertFirst(int newdata) 
    { 
        Node newNode = new Node(newdata); 
newNode.next = head; 
        newNode.prev = null; 
        if (head != null) 
            head.prev = newNode; 
        head = newNode; 
    } 
    public void InsertAfter(int key, int newdata) 
    { 
  
        Node newnode = new Node(newdata); 
  Node temp=head;
  while(temp.data!=key)
  {
      
      temp=temp.next;
  }
   newnode.next=temp.next;
     newnode.prev=temp;
       temp.next=newnode;
  if (newnode.next != null) 
            newnode.next.prev = newnode; 
        } 
    void insertLast(int newdata) 
    { 
        Node newnode = new Node(newdata); 
  Node last = head; 
        newnode.next = null; 
         if (head == null) { 
            newnode.prev = null; 
            head = newnode; 
            return; 
        } 
        while (last.next != null) 
            last = last.next; 
        last.next = newnode; 
    newnode.prev = last; 
    } 
  public void printlist() 
    { 
        Node tmp=head;
        
        Node last = null; 
        System.out.println("Traverse in forward dir"); 
        while (tmp!= null) { 
            System.out.print(tmp.data + " "); 
            last = tmp; 
            tmp = tmp.next; 
        } 
        System.out.println(); 
        System.out.println("Traverse in reverse dir"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        D dll = new D(); 
        dll.insertLast(6); 
        dll.insertFirst(7); 
        dll.insertFirst(1); 
        dll.InsertAfter(1, 8); 
        System.out.println(" DLL is: "); 
        dll.printlist(); 
    } 
} 
  
