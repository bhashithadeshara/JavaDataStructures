
public class ArrayList {
	
	int [] arr;
	int capacity = 5;
	int size = 0;
	
	public ArrayList() {
		
		this.arr = new int [capacity];
	}
    
    public ArrayList(int capacity) {
		
    	
    	this.capacity = capacity;
		this.arr = new int [this.capacity];
	}
    
    public void add(int element) {
    	
    	ensureCapacity();
    	arr[size++] = element;
    	System.out.println(element+" inserted at "+(size));
    }
    
    public void add(int element,int index) {  
	  
	   if(index > (size)) {
		   
		   System.out.println("index is out from the range");
		   return;
	   }else {
		   ensureCapacity();
		   for(int i=size;i>index;i--) {	    		
	    	  arr[i] = arr[i-1];    		
	       }
	       arr[index] = element;	     
	       this.size++;
	       System.out.println(element+" inserted at the "+index);		    
	    	 
	   }
    	
    }
    
    public void ensureCapacity() {
    	
    	  if(size == capacity) {
      		
      		System.out.println("Array container overflow");
      		capacity = capacity +(capacity >>1);
      		System.out.println("The new capacity is "+capacity);
      		int [] newArr = new int [capacity];
      		
      		for(int i=0;i<size;i++) {
      			
      			newArr[i] = arr[i];
      		}
      		
      		this.arr = newArr;
      	}
    }
    
    public int  getSize() {
	   return this.size;
    }
    
    @Override
    public String toString() {

     StringBuilder sb = new StringBuilder();
     sb.append("[");
     for(int i=0;i<size;i++) {
    	 sb.append(arr[i]).append(",");
     }
	 sb.deleteCharAt(sb.length()-1);
	 sb.append("]");
	 
	 return sb.toString();
     
    }
    
	public static void main(String[] args) {
		
		ArrayList as = new ArrayList();
		as.add(10);
		System.out.println("size = "+as.getSize());
		as.add(20);
		System.out.println("size = "+as.getSize());
		as.add(30);
		System.out.println("size = "+as.getSize());
		System.out.println(as);
		
		as.add(40,1);
		System.out.println("size = "+as.getSize());
		System.out.println(as);
		
		
        as.add(50,4);
        as.add(60); 
        as.add(80,6); 
        
        
		System.out.println(as);
		
	
				
	}

}
