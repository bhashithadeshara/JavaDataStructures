
public class Stack {

	int [] stack;
	int capacity = 5;
	int top = -1;
	
	public Stack() {
		
		stack = new int[capacity];
	}
	
	public Stack(int capacity) {
		
		this.capacity = capacity;
		this.stack = new int[this.capacity];
	}
	
	public void push(int element) {
		
		if(top == capacity -1) {
			System.out.println("Stack is full");
			return;
		}else {
			this.stack[++top] = element;
			System.out.println(element+" is inserted");
		}
		
	}
	
	public void pop() {
		
		if(top == -1) {
			System.out.println("stack is empty");
			return ;
		}else {
			int element = this.stack[top--];
			System.out.println(element+" is removed");
		}
		
	} 
	
	public int peek() {
		
		return this.stack[top];
	}
	
	
	public static void main(String[] args) {


		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		
		System.out.println();
		System.out.println("The peek is "+st.peek());
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
	}

}
