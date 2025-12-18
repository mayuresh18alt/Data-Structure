package sorting;

public class Binarysearch {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int key=5;
		
		int result=searchbinary(arr,key);
		
		if(result != -1) {
			System.out.println("element  found at index"+" "+result);
		}else {
			System.out.println("element not found ");
		}
	}
	
	static int searchbinary(int arr[],int key) {
		int low=0;
		int high = arr.length - 1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==key) {
				return mid;
			}	else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		return -1;
	}
}
