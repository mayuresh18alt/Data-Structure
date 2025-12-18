package array;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {2,1,4,3,5,6,7};
		
		int max=arr[0];
		int secondmax=0;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			 else if (arr[i] > secondmax && arr[i] < max) {
	                secondmax = arr[i];
	            }
		}
		System.out.println("First Max Element is the\t"+max);
		System.out.println("Second Max element is the\t"+secondmax);
	}

}
