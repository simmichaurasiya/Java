class LinkL
{ 
	Node head; 
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
	head = new_node; 
	} 
	public void insertAfter(int key, int new_data) 
	{ 
          Node temp=head;
          Node prev_node;
          while(temp.data!=key)
          {
              prev_node=temp;
              
              temp=temp.next;
          }
          prev_node=temp;
		if (prev_node == null) 
		{ 
			System.out.println("previous node cannot be null"); 
			return; 
		} 
		Node new_node = new Node(new_data); 
		new_node.next = prev_node.next; 
		prev_node.next = new_node; 
	} 
	public void append(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		if (head == null) 
		{ 
			head = new Node(new_data); 
			return; 
		} 
		new_node.next = null; 
		Node last = head; 
		while (last.next != null) 
			last = last.next; 
	last.next = new_node; 
		return; 
	} 	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	} 
	public static void main(String[] args) 
	{ 
            LinkL llist = new LinkL(); 
		llist.append(6); 
		llist.push(7); 
		llist.push(1); 
		llist.append(4); 
		llist.insertAfter(7, 8); 
                llist.insertAfter(8, 10);
                

		System.out.println("\nLink Lst is: "); 
		llist.printList(); 
	} 
} 