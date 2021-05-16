package com.mp.sll;

public class SinglyLinkedList {
	
	Node head;    //first node will referred as head
	
	public void insert(int data)  //data will element that get added like 5. insert mtd will insert data in last
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			
			head = node;      //if it is first element that is head.
		}
		else {
			//in this case we need to add new node in last and for that we need to check which is last node. Hence for this we will
			//get head fisrt and jump to next and so on and stop where we get next null.
			
			Node last = head;       //here last is the temporary node
			while(last.next!= null)
			{
				last= last.next;
			}
			last.next = node;   //if last.next is null then put new node address in it.
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;  //here we will point current node.next to head.
		head=node;  //assign current node to head node.
		
		
	}
	
	public void insertAt(int index , int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		if(index == 0)
		{
			insertAtStart(data);
		}
		else {
		for(int i= 0 ; i< index-1 ;  i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
	
	public void deleteAt(int index)
	{
		if(index == 0)
		{
			head = head.next;
		}
		else {
			Node n = head;
			Node n1 = head;
			
			for(int i = 0; i< index-1; i++)
			{
				n=n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("n1" + n1.data);
			n1 =null;
		}
	}
	
	
	
	public void show()
	{
		Node node = head;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);    //this for to pring last node
	}
		

	public static void main(String[] args) {
		
		 SinglyLinkedList sll = new SinglyLinkedList();
		 sll.insert(2);
		 sll.insert(45);
		 sll.insert(30);		 
		 sll.insertAtStart(100);		 
		 sll.insertAt(2, 55);
		 sll.deleteAt(2);
		 sll.show();
	}

}
