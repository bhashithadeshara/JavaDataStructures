
public class CircularQueue {

	int [] queue;
	int capacity = 3;
	int size = 0;
	int front = 0;
	int rear = -1;
	
	public CircularQueue() {
		
		queue = new int [capacity];
	}
	
    public CircularQueue(int capacity) {
		
    	this.capacity = capacity;
		this.queue = new int [this.capacity];
	}
    
	public void enqueue(int element) {
		
		if(size == capacity) {
			
			System.out.println("Queue is full");
			return ;
		}
		else {
			
			rear = rear + 1;
			
			if(rear == capacity) {
				
				rear = 0;
			}
			queue[rear] = element;
			size++;
			System.out.println(element + " is inserted at "+rear);
			System.out.println("The size is "+size);
		}
	}
	
    public void dequeue() {
    	
    	if(size ==0) {
    		
    		System.out.println("Queue is empty");
			return ;
			
    	}else {
    		
    		if(front == capacity) {
    			front =0;
    		}
    		
    		int element = queue[front];
    		size--;
    		System.out.println(element + " is removed at "+front);
			System.out.println("The size is "+size);
			front++;
    	}
    }
	
	public static void main(String[] args) {
		
		CircularQueue circularQueue = new CircularQueue();
		circularQueue.enqueue(10);
		System.out.println("");
		circularQueue.enqueue(20);
		System.out.println("");
		circularQueue.enqueue(30);
		
		System.out.println("");
		circularQueue.dequeue();
		
		System.out.println("");
		circularQueue.enqueue(40);		
		
		
		/*System.out.println("");
		System.out.println("");*/
		circularQueue.dequeue();
		System.out.println("");
		
		circularQueue.dequeue();
		System.out.println("");
		
		System.out.println("");
		circularQueue.enqueue(50);
		
		circularQueue.dequeue();
		System.out.println("");
		
		circularQueue.dequeue();
		System.out.println("");
	}

}
