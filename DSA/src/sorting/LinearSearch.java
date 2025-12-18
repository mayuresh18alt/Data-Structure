package sorting;

public class LinearSearch {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		int key=5;
		
		int result= searchlinear(arr,key);
		
		if(result != -1) {
			System.out.println("element found at index"+" "+result);
		}else {
			System.out.println("element not found");
		}
		
	}
	
	static int searchlinear(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
}
