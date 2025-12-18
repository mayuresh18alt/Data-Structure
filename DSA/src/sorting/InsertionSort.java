package sorting;

public class InsertionSort {
//	public static void main(String args[]) {
//		int arr[]= {4,8,7,5,1,2,3};
//		int n=arr.length;
//		
//		for(int i=1;i<n;i++) {
//			int key=arr[i];
//			int j=i-1;
//			
//			while(j>=0 && arr[j]>key) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=key;
//		}
//		System.out.println("insertion sort");
//		for(int x:arr) {
//			System.out.print(x+" ");
//		}
//	}
	public static void main(String args[]) {
		int arr[]= {3,2,1,5,4};
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("insertion sort");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}
