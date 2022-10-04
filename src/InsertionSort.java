
public class InsertionSort {

	public static void main(String[] args) {
		
		int [] arr = {6,5,2,7,3,4,1};
		
		int size = arr.length;
		
		for(int i=1;i<size;i++) {
			
			int temp = arr[i];
			int j=i-1;
			
			while(j>=0 && temp < arr[j]) {
			
				if(arr[j] > temp) {
					
					arr[j+1] = arr[j];
					j--;
				}
			}
			
			arr[j+1] = temp;
		}
		
		for(int i=0;i<size;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
