package LinkedListPackage;

public class LinkelyList {

	private ListNode head;
	
	private static class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		
		
        ListNode currentNode = head;
        
        while(currentNode.next != null) {
        	
        	System.out.print(currentNode.data+" ");
        	currentNode = currentNode.next;
        }
        System.out.print(currentNode.data+" ");
	}
	
	public int getLength() {
		
		if(head == null) {
			
			return 0;
		}
		
		int count = 0;
		
		ListNode currentNode = head;
		
		while(currentNode != null) {
			
			count++;
			currentNode = currentNode.next;
		}		
		
		return count;
		
	}
	
	public void insertAtStart(int data) {
		
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			
			head = newNode;
			
		}else {
			ListNode currentNode = head;
			
			while(currentNode.next != null) {
				
				currentNode = currentNode.next;
			}
			
			currentNode.next = newNode;
	    }
		
	}
	
	public void startAtAny(int data,int position) {
		
		ListNode newNode = new ListNode(data);
		
		if(position == 1) {
			
			insertAtStart(data);
		}else {
			
			ListNode node = head;
			
			int i=1;
			
			while(i<position-1) {
				
				node = node.next;
				i++;
			}
			
			newNode.next = node.next;
			node.next =newNode;
		}
		
	}
	
	public int deleteHeadNode() {
		
		if(head == null) {
			
			return -1;
		}else {
			
			ListNode temp =head;
			head = head.next;
			return temp.data;
		}
	}
	
	public void deleteNodeAtEnd() {
		
		if(head == null || head.next == null) {
					
					
				}else {
					
					ListNode node = head;
					ListNode previous = null;
					
					while(node.next != null) {				
						previous = node;
						node = node.next;
						
					}
					
					previous.next = null;			
					
				}		
	}
	
	public void deleteElementAtPosition(int position) {
		
		ListNode node = head;
		int i=1;
		
		if(position == 1) {
			deleteHeadNode();
		}else {
			
			while(i<position-1) {
				
				node = node.next;
				i++;
			}
		}	
		
		ListNode tempNode = node.next;
		node.next= tempNode.next;
	}
    public static void main(String[] args) {
		
    	LinkelyList ll = new LinkelyList();
    	ll.head = new ListNode(10);
    	
    	ListNode second = new ListNode(8);
    	ListNode third = new ListNode(1);
    	ListNode fourth = new ListNode(11);
    	
        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        
        ll.display();
        
        System.out.println();
        System.out.println("The length is "+ll.getLength());
        
        ll.insertAtStart(20);
        
        
        
        ll.display();
        System.out.println();
        ll.insertAtEnd(30);
        ll.display();
        
        System.out.println();
        ll.startAtAny(90,3);
        ll.display();
        
        System.out.println();
        System.out.println();
        
        System.out.println( ll.deleteHeadNode()+"is deleted");             
        ll.display();
        System.out.println();
       
        System.out.println();
        
        System.out.print( ll.deleteHeadNode()+"is deleted");
        System.out.println(); 
        ll.display();
        System.out.println();   
        
        ll.deleteNodeAtEnd();
        System.out.println();   
        ll.display();
        
        System.out.println(); 
        ll.deleteElementAtPosition(3);
        System.out.println();   
        ll.display();
      
	}

}
