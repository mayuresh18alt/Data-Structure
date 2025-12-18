package sorting;

public class BubbleSort {
public static void main(String args[]) {
	int arr[]= {4,5,3,8,7,6,2,1};
	
	int n=arr.length;
	
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("bubble sort");
	for(int x:arr) {
		System.out.print(x+" ");
	}
}
}
