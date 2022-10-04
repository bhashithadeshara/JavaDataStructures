
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
		}else {
			
			queue[++rear] = element;
			System.out.println(element+" is inserted");
		}
	}
		 
    public void dequeue() {
		
		if(front == rear +1) {
			
			System.out.println("Queue is empty");
			return;
		}else {
			
			int element = queue[front];
			
			for(int i=front;i<rear;i++) {
				
				queue[i] = queue[i+1];
			}
			rear--;
			
			System.out.println(element+" is removed");
		}
	}
    
    public int getFront() {
    	
    	if(front == rear+1) {
    		
    		System.out.println("Queue is empty");
			return -1;
    		
    	}else {
    		
    		return queue[front];
    	}
    }
    
    public int getRear() {
    	
       if(front == rear+1) {
    		
    		System.out.println("Queue is empty");
			return -1;
    		
    	}else {
    		return queue[rear];
    	}
    	
    }
    
	public static void main(String[] args) {
		
		Queue que = new Queue();
		que.enqueue(10);
		que.enqueue(20);
		que.enqueue(30);
		que.enqueue(40);
		que.enqueue(50);
		que.enqueue(60);
		
		System.out.println("");
		
		que.dequeue();
		que.dequeue();
		que.dequeue();
		//que.dequeue();
		//que.dequeue();
		//que.dequeue();
		
		System.out.println("");
		System.out.println("front is "+que.getFront());
		System.out.println("Rear is "+que.getRear());
	}

}
