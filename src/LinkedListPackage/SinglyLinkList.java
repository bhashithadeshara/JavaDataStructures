package LinkedListPackage;


class Node{
	
	int data;
	Node next;
		
}

public class SinglyLinkList {
	
	Node head;
	
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		
		if(head == null) {
			
			this.head = node;
		}else {
			
			Node currentNode = head;
			
			while(currentNode.next != null) {
				
				currentNode = currentNode.next;
			}
			
			currentNode.next = node;
		}
	}
    
	public boolean search(int key) {	
		
		if(head == null) {
			
			return false;
		}
		
		Node currentNode = head;
		
		while(currentNode != null) {
			
			if(currentNode.data == key) {
				
				return true;
			}
			currentNode = currentNode.next;
		}
		
		return false;
		
	}
	
	public Node reverse() {
		
		
		if(head == null) {
			return null;
		}
		
		Node currentNode = head;
		Node previousNode = null;
		Node nextNode = null;
		
		while(currentNode != null) {
			
			nextNode = currentNode.next; 
			currentNode.next = previousNode;
			previousNode= currentNode;
			currentNode = nextNode;
		}
		
		return previousNode;
	}
	
	
	public int findNvlaue(int point) {
		if(head == null) {
			return -1;
		}
		
		Node mainPtr = head;
		Node refPtr = head;
		int count =0;
		
		while(count < point ) {
			
			refPtr = refPtr.next;
			count++;
		}
		
		while(refPtr != null) {
			
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		
		return mainPtr.data;
	}
	
	
	public void display() {
		
		Node node = head;
		
		while(node != null) {
			
			System.out.print(node.data+" -->");
		    node = node.next;
 		}
	}
	
    public void display(Node head) {
		
    	Node node = head;
		
		while(node != null) {
			
			System.out.print(node.data+" ");
		    node = node.next;
 		}
	}
	
    public int findMid() {
    	
    	Node slowPtr = head;
    	Node fastPtr = head;
    	
    	while(fastPtr != null && fastPtr.next != null) {
    		
    		slowPtr = slowPtr.next;
    		fastPtr = fastPtr.next.next;
    	}
    	
    	return slowPtr.data;
    }
	
	public static void main(String[] args) {
		
       SinglyLinkList ts = new SinglyLinkList();
       ts.insert(10);
       ts.insert(20);
       ts.insert(30);
       ts.insert(40);   
       //ts.insert(50);
       
       ts.display();
       System.out.println();
       System.out.println("Searh key found = "+ts.search(550));
       
       /*Node reverseHead = ts.reverse();
       ts.display(reverseHead);*/
       
       System.out.println();
       System.out.println("The mid is "+ts.findMid());
       
       System.out.println("The mid is "+ts.findNvlaue(4));
       
       
	}

}
