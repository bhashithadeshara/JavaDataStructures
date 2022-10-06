class Node{
	
	int data;
	Node next;
}

public class LinkedList {
	
	Node head;	
	
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			
			head = node;
			
		}else {
			
			Node n = head;
			
			while(n.next != null) {
				
				n = n.next;
			}
			
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;		
		node.next = head;
		 
		head = node;
		
	}
	
    public void insertAtAny(int index,int data) {
		
		Node node = new Node();
		node.data = data;		
		node.next = null;
		 
		if(index == 0) {
			
		}
		
	}
    
	public void display() {
		
		Node n = head;
		
		while(n.next != null) {
			
			System.out.print(n.data+" ");
			n = n.next;
		}
		
		System.out.print(n.data);
		System.out.print(n.next);
		
	}
	
		
    public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		ls.insert(10);
		ls.insert(20);
		ls.insert(30);
		
		ls.display();
		
		ls.insertAtStart(40);
		
		System.out.println();
		
		ls.display();
	}
	
}
