
public class Queue {

	int [] queue;
	int capacity = 5;
	int front =0;
	int rear = -1;
	
	public Queue() {
		
	  this.queue = new int [capacity];
		
	}
	
	public Queue(int capacity) {
		
	  this.capacity = capacity;
      this.queue = new int [this.capacity];
			
	}
	
	public void enqueue(int element) {
		
		if(rear == capacity -1) {
			
			System.out.println("Queue is full");
			return;
		}
	}
		 
	
	public static void main(String[] args) {
		
		
		
		
	}

}
